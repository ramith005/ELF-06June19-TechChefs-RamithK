import React, { Component } from 'react';
import AdminNavbar from '../navbar/AdminNavbar';
import Axios from 'axios';

export default class AllUsers extends Component {
    constructor(props){
        super(props);
        this.state={
            beans:null
        }
        if(localStorage.getItem("beans")!=null)
    {
        this.state.beans=JSON.parse(localStorage.getItem("beans"));
    }
    }

    // componentDidMount(){
    //     Axios.get('http://localhost:8080/getAllUsers').then((response)=>{
    //         console.log('Response Object',response.data);
    //         if(response.data.message === "success"){
    //           localStorage.setItem("beans",JSON.stringify(response.data.beans));
    //           this.props.history.push('/allUsers');          
    //         }else{
    //           this.props.history.push('/AdminHome');
    //           localStorage.setItem('nouser',response.data.description);
    //         }
    //     }).catch((error)=>{
    //         console.log('Error',error);
    //     })
    // }

    deleteUser(bean){
        console.log(bean);
        let userId = bean.userId;
        Axios.put('http://localhost:8080/deActivateUser', null, {
            params: {
                id: userId
            }
        }).then((response) => {
            console.log('Response Object', response.data);
            if (response.data.message === "success") {
                console.log(response.data.beans[0].userType);
                if (response.data.beans[0].userType === 'admin') {
                    this.props.history.push('/adminHome');
                    localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
                } else if (response.data.beans[0].userType === 'librarian') {
                    this.props.history.push('/librarianHome');
                    localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
                } else if (response.data.beans[0].userType === 'normalUser') {
                    this.props.history.push('/userHome');
                    localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
                }else {
                    this.props.history.push('/');
                    localStorage.setItem('msg',response.data.description);
                }
            }
            }).catch((error) => {
                console.log('Error', error);
            })
    }
    editUser(e){
        alert("Call the Edit user ...!");
    }
    render() {
        return (
            <div>
                 <AdminNavbar></AdminNavbar>
                <div>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone number</th>
                            <th scope="col">User Type</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.beans.map((bean) => {
                                return <tr key={bean.userId}>
                                    <td>{bean.firstName}</td>
                                    <td>{bean.email}</td>
                                    <td>{bean.phoneNo}</td>
                                    <td>{bean.userType}</td>
                                    <td>
                                        <button onClick={this.deleteUser.bind(this, bean)} className='btn btn-danger'>Delete</button>
                                    </td>
                                    <td>
                                        <button onClick={this.editUser.bind(this, bean)} className='btn btn-success'>Edit</button>
                                    </td>
                                </tr>
                            })

                        }
                    </tbody>
                </table>
                </div>
            </div>
        )
    }
}
