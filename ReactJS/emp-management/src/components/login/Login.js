import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import React, { Component } from 'react'
import Axios from 'axios'
import createEmployee from '../createAccount/createEmployee';
import HomePage from '../homePage/HomePage';

export class Login extends Component {
    constructor(props){
        super(props);

        this.state = {
            id : '',
            password : '',
            errorMessage: ''
        }

        this.postLoginData = this.postLoginData.bind(this);
    }
    logoutApp(){

    }
    postLoginData(event) {
        event.preventDefault();
        //let accountData = this.state;
        const {id,password} = this.state;
        const loginData = {id,password};

        if(this.validateLogin(loginData)){
            //Call the API using Axios and Validate the Employee Login
            Axios.post('http://localhost/emp-springrest/login/auth',null,{
                params:{
                    id:this.state.id,
                    password:this.state.password
                }
            }).then((response)=>{
                if(response.data.statusCode==401){
                    console.log("40111");
                    this.setState({errorMessage:response.data.message});
                    var element = document.getElementById("errorMsg");
                    element.classList.remove("hide");
                    element.classList.add("show");
                } else{
                    //Redirect the Application to Employee Home page
                    let employeeData = response.data.beans[0];
                    localStorage.setItem("bean",JSON.stringify(employeeData));
                    this.props.history.push('/HomePage');

                }
            }).catch((error)=>{
                console.log('Error',error);
            });
        }
    }

    validateLogin(loginData){
        let validationSuccess = false;

        if(loginData.id.trim()==="" || loginData.id.trim()===null){
            alert('Please enter Employee Id');
            document.getElementById("id").focus();
            return validationSuccess;
        } else if(loginData.password.trim()==="" || loginData.password.trim()===null){
            alert('Please enter Password');
            document.getElementById("password").focus();
            return validationSuccess;
        } else{
            validationSuccess = true;
        }

        return validationSuccess;
    }

    openCreateEmployee(event){
        event.preventDefault();
        this.props.history.push('/createEmployee');
    }

    render() {
        const {navigation} = this.props;
        if(navigation)
        {
            console.log(navigation)
        const message = navigation.getParam('message');
         } return (
            <div className="container">
              <div className="row">
                <div className="col-md-6 offset-3 card">
                  <div className="card-body">
                    <h4 className="text-center border-bottom">Employee Login</h4>
                    <br />
                    <div id="errorMsg" className="alert alert-warning alert-dismissible fade hide"   role="alert">
                      {this.state.errorMessage}
                      <button type="button" className="close" data-dismiss="alert" aria-label="Close">
                        <span aria-hidden="true">×</span>
                      </button>
                    </div>
                    <form className="form-horizontal" onSubmit={this.postLoginData} /*action="./authenticate"*/ method="POST">
                      <div className="col-auto">
                        <label className="sr-only" htmlFor="id">Id</label>
                        <div className="input-group mb-2">
                          <div className="input-group-prepend">
                            <div className="input-group-text">ID</div>
                          </div>
                          <input id="id" onChange={(event)=>{this.setState({id:event.target.value})}} value={this.state.id} type="number" className="form-control" name="id" placeholder="Enter Employee ID" />
                        </div>
                      </div>
                      <span id="email-error" style={{display: 'none'}} className="text-danger small" />
                      <div className="col-auto">
                        <label className="sr-only" htmlFor="password">Password</label>
                        <div className="input-group mb-2">
                          <div className="input-group-prepend">
                            <div className="input-group-text">Password</div>
                          </div>
                          <input id ="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} type="password" className="form-control" name="password" placeholder="Enter Password" />
                        </div>
                      </div>
                      <br />
                      <div className=" row">
                        <button type="reset" className="offset-1 col-md-5 btn btn-outline-dark" style={{borderRadius: '3px 0 0 3px', borderRight: 0}}>Reset</button>
                        <button type="submit" className="col-md-5 btn btn-outline-info" style={{borderRadius: '0 3px 3px 0'}}>Login</button>
                      </div>
                      <br />
                      <div className=" row">
                        <a href="../employee/createEmployeePage" onClick={this.openCreateEmployee.bind(this)} className="offset-1 col-md-5 btn btn-outline-success" style={{borderRadius: '3px 0 0 3px', borderRight: 0}}>Create
                          Account</a> 
                        <a href="forgotpassword.html" className="col-md-5 btn btn-outline-success" style={{borderRadius: '0 3px 3px 0'}}>Forgot Password</a>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          );
    }
}

export default Login
