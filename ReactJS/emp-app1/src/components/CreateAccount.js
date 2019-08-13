import React, { Component } from 'react'
import Axios from 'axios';

export class CreateAccount extends Component {
    constructor(props){
        super(props);
        this.state = {
            name : '',
            email : '',
            phoneno : '',
            password : ''
        }

        this.postData = this.postData.bind(this);
    }
    postData(event){
       event.preventDefault();
        console.log('Post Data',this.state);
        let accountData = this.state;

        const {id,name,email,password,phoneno} = this.state;
        const account = {name,email,password,phoneno};

        //Axios Returns the Promises
        if(this.validateFormFields(account)){
            Axios.post('https://emp-app-c8223.firebaseio.com/accounts.json',accountData).then((response)=>{
                console.log('Response Object',response);
                this.state = {
                    name : '',
                    email : '',
                    phoneno : '',
                    password : ''
                }
            }).catch((error)=>{
                console.log('Error',error);
            });
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
    render() {
        return (
            <div>
                <form onSubmit={this.postData} style={{marginTop:50,marginBottom:40,margin:50}}>
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
                    <div>
                        <button style={{marginLeft:500,marginTop:40}} className='btn btn-success' type='submit'>Create Employee</button>
                    </div>
                </form>
            </div>
        )
    }
}

export default CreateAccount

