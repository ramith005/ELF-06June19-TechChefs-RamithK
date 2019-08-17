import React, { Component } from 'react'
import Navbar from '../navbar/Navbar';
export class HomePage extends Component {
    constructor(props){
        super(props);
        this.state = {
            bean:JSON.parse(localStorage.getItem("bean"))
        }
    }

    render() {
        return (
            <div className="container">
                <Navbar />
                <div className="row">
                    <div className="col-md-12">
                        <a href="<%=baseURL%>/emp-springmvc/employee/updateEmployeePage">Update Employee</a>
                    </div>
                </div>
                <br />
                <div className="row">
                    <div className="col-md-5 card ">
                        <div className="card-body">
                            <h5>Personal Details</h5>
                            <hr />
              <table className="table table-striped">
                                <tbody><tr>
                                    <td>Name</td><td>{this.state.bean.name}</td><td>&nbsp;</td>
                                </tr>
                                    <tr>
                                        <td>Age</td>
                                        <td>{this.state.bean.age}</td>
                                    </tr>
                                    <tr>
                                        <td>Gender</td>
                                        <td>{this.state.bean.gender}</td>
                                    </tr>
                                    <tr>
                                        <td>DOB</td>
                                        <td>{this.state.bean.dob}</td>
                                    </tr>
                                </tbody></table>
                        </div>
                    </div>
                    <div className="offset-2 col-md-5 card ">
                        <div className="card-body">
                            <h5>Contact Details</h5>
                            <hr />
                            <table className="table table-striped">
                                <tbody><tr>
                                    <td>Email</td>
                                    <td>{this.state.bean.email}</td>
                                </tr>
                                    <tr>
                                        <td>Phone Number</td>
                                        <td>{this.state.bean.phone}</td>
                                    </tr>
                                    <tr>
                                        <td>Address 1</td>
                                        <td>{this.state.bean.phone}</td>
                                    </tr>
                                    <tr>
                                        <td>Address 2</td>
                                        <td>{this.state.bean.phone}</td>
                                    </tr>
                                </tbody></table>
                        </div>
                    </div>
                </div>
                <br /> <br />
                <div className="row">
                    <div className="col-md-12 card ">
                        <div className="card-body">
                            <h5>Professional Details</h5>
                            <hr />
                            <table className="table table-striped">
                                <tbody><tr>
                                    <td>Salary</td>
                                    <td>{this.state.bean.salary}</td>
                                    <td>Manager ID</td>
                                    <td>{this.state.bean.mngrId}</td>
                                </tr>
                                    <tr>
                                        <td>Joining Date</td>
                                        <td>{this.state.bean.joiningDate}</td>
                                        <td>Department ID</td>
                                        <td>{this.state.bean.departmentId}</td>
                                    </tr>
                                    <tr>
                                        <td>Designation</td>
                                        <td>{this.state.bean.designation}</td>
                                        <td>Account Number</td>
                                        <td>{this.state.bean.accountNumber}</td>
                                    </tr>
                                </tbody></table>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default HomePage
