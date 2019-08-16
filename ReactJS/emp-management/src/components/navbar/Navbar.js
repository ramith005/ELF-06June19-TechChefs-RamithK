import React, { Component } from 'react'
import Axios from 'axios'
import {withRouter} from 'react-router-dom'

 class Navbar extends Component {
     constructor(props){
         super(props)
     }
    logoutApp(event) {
        event.preventDefault();
        Axios.get("http://localhost/emp-springrest/login/logout").then((response)=>{
            if(response.data.statusCode==201){
              console.log(response.data) 
                localStorage.clear();  //clear the local storage
                this.props.history.push('/'); // redirect to home page
            }
        }).catch((error)=>{
            console.log(error)
            // alert("There are some issues while logout");
        })
    }
    render() {
        return (
            <div className="row navbar navbar-inverse">
                <div className="col-md-2">
                    <a href="<%=baseURL%>/validator/validate/getHomePage"><img src="./logo512.png" style={{ width: '70px', height: '70px' }} /></a>
                </div>
                <div className="col-md-8">
                    <form action="<%=baseURL%>/validator/validate/employee/search">
                        <input type="search" name="q" placeholder="Enter Employee ID or Name" className="form-control" />
                    </form></div>
                <div className="col-md-1">
                    <button type="submit" className="fa fa-search  border-0" style={{ fontSize: '25px', backgroundColor: 'rgba(255, 255, 255, 0)', color: 'rgba(110, 104, 104, 0.8)', position: 'relative', left: '-75px' }} />
                </div>
                <div className="col-md-1">
                    <a href="<%=baseURL%>/logout" onClick={this.logoutApp.bind(this)}>Logout</a>
                </div>
            </div>
        )
    }
}

export default withRouter(Navbar)
