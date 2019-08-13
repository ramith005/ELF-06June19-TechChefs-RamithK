import React, { Component } from 'react'
import Axios from 'axios';
import {Modal,Button} from 'react-bootstrap'

export class ViewAccounts extends Component {

    constructor(props) {
        super(props);
        this.state = {
            accounts : [],
            show : false,
            name: '',
            email: '',
            phoneno: '',
            password: '',
            id : ''
        }
    }
    componentDidMount() {
        Axios.get('https://emp-app-c8223.firebaseio.com/accounts.json',).then((response)=>{
            console.log("Response Data",response.data);
            let fetchedAccounts = [];

            for(let key in response.data){
                fetchedAccounts.push({
                    ...response.data[key],
                    id: key
                })
                this.setState({
                    accounts : fetchedAccounts
                })
                console.log(fetchedAccounts)
            }
        }).catch((error)=>{
            console.log("Error ",error);
        })
    }

    getAccount(){
        Axios.get('https://emp-app-c8223.firebaseio.com/accounts.json',).then((response)=>{
            console.log("Response Data",response.data);
            let fetchedAccounts = [];

            for(let key in response.data){
                fetchedAccounts.push({
                    ...response.data[key],
                    id: key
                })
                this.setState({
                    accounts : fetchedAccounts
                })
                console.log(fetchedAccounts)
            }
        }).catch((error)=>{
            console.log("Error ",error);
        })
    }

    render() {
        return (
            <div>
                <table class="table table-striped">
                <thead>
                    <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Phone No</th>
                    <th scope="col">Password</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.accounts.map((account)=>{
                            return <tr key={account.id}>
                                    <td>{account.name}</td>
                                    <td>{account.email}</td>
                                    <td>{account.phoneno}</td>
                                    <td>{account.password}</td>
                                    <td>
                                        <button onClick={this.deleteAccount.bind(this,account)} className='btn btn-danger'>
                                            Delete
                                        </button>
                                    </td>
                                    <td>
                                        <button onClick={this.editAccount.bind(this,account)} className='btn btn-success'>
                                            Edit
                                        </button>
                                    </td>
                            </tr>
                        })
                    }
                </tbody>
                </table>
                <div>
                    
                    <Modal show={this.state.show} onHide={this.handleClose.bind(this)}>
                        <Modal.Header closeButton>
                        <Modal.Title>Edit Employee Details</Modal.Title>
                        </Modal.Header>
                        <Modal.Body>
                        <div className="row">
                            <div className="col">
                                <input id="name" style={{marginBottom:15}} type="text" onChange={(event)=>{this.setState({name:event.target.value})}} value={this.state.name} className="form-control" placeholder="Name" />
                            </div>
                            <div className="col">
                                <input id="email" type="text" onChange={(event)=>{this.setState({email:event.target.value})}} value={this.state.email} className="form-control" placeholder="Email" />
                            </div>
                        </div>
                        <div className="row">
                            <div className="col">
                                <input maxLength="10" id="phone" type="number" onChange={(event)=>{this.setState({phoneno:event.target.value})}} value={this.state.phoneno} className="form-control" placeholder="Phone" />
                            </div>
                            <div className="col">
                                <input id="password" type="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} className="form-control" placeholder="Password" />
                            </div>
                        </div>
                        </Modal.Body>
                        <Modal.Footer>
                        <Button variant="secondary" onClick={this.handleClose.bind(this)}>
                            Close
                        </Button>
                        <Button variant="primary" onClick={this.updateAccountData.bind(this)}>
                            Save Changes
                        </Button>
                        </Modal.Footer>
                    </Modal>
                </div>
            </div>
        )
    }
    //Function to Edit the Employee Details 
    editAccount(account){
        this.setState({
            name : account.name,
            email: account.email,
            phoneno:account.phoneno,
            password:account.password,
            id: account.id,
            show: !this.state.show
        })
    }

    handleShow() {

    }

    updateAccountData(){

        
        const {id,name,email,password,phoneno} = this.state;
        const account = {name,email,password,phoneno};

        //Validate the Form on Edit
        //this.validateFormFields();

        console.log(account)
        if(this.validateFormFields(account)){
            let that = this;
            Axios.put('https://emp-app-c8223.firebaseio.com/accounts/'+id+'/.json',account).then((response)=>{
                console.log('Updated Successfully ....');
                this.handleClose();
                this.getAccount();
            }).catch((error)=>{
                console.log('Updation Failed ....');
            })
        }
    }

    //Function to validate the Form
    validateFormFields(account){
        let validationSuccess = false;
        if(account.name.trim()=="" || account.name.trim()==null){
            alert('Please enter Name');
            document.getElementById("name").focus();
            return validationSuccess;
        } else if(account.email.trim()=="" || account.email.trim()==null){
            alert('Please enter Email');
            document.getElementById("email").focus();
            return validationSuccess;
        } else if(!this.validateEmail(account.email.trim())) {
            document.getElementById("email").focus();
            alert('Please enter valid Email');
            return validationSuccess;
        } else if(account.phoneno.trim()=="" || account.phoneno.trim()==null){
            document.getElementById("phone").focus();
            alert('Please enter Phone number');
            return validationSuccess;
        } else if(!(account.phoneno.trim().length == 10)){
            alert('Phone number should be 10 digits');
            document.getElementById("phone").focus();
            return validationSuccess;
        } else if(account.password.trim()=="" || account.password.trim()==null){
            alert('Password should not be empty');
            document.getElementById("password").focus();
            return validationSuccess;
        } else if(account.password.trim().length < 5){
            alert('Password should have minimun 5 characters');
            document.getElementById("password").focus();
            return validationSuccess;
        } else{
            validationSuccess = true;
        }

        return validationSuccess;
    }

    validateEmail(email){
        var re = /\S+@\S+\.\S+/;
        return re.test(email);
    }

    handleClose() {
        this.setState({
            show: !this.state.show
        })
    }

    deleteAccount(account) {
        console.log(account);
        Axios.delete('https://emp-app-c8223.firebaseio.com/accounts/'+account.id+'/.json').then((response)=>{
            //alert('Deleted Successfully ..');
            let allAccounts = this.state.accounts;
            let index = allAccounts.indexOf(account);
            let newAccounts = allAccounts.splice(index,1);
            this.setState({
                accounts : allAccounts
            })
            //this.getAccount(); // We can also call the getAccount method on delete ,but better not to call the request unnecessary if the same can be done in UI
        }).catch((error)=>{
            alert('Deletion Failed ..');
        })
    }
}

export default ViewAccounts
