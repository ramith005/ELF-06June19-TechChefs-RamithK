import React, { Component } from 'react'

export class Experience extends Component {
    render() {
        return (
            <div className="row">
                <div className="col-md-8 offset-2 card form1">
                    <div className="card-body">
                        <h4 className="text-center border-bottom">Employee Experience
                Details</h4>
                        <br />
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="company_name">Company Name</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Company Name</div>
                                </div>
                                <input type="text" required className="form-control" name="experienceInfoBeans[0].experiencePKBean.companyName" id="company_name" placeholder="Enter Company Name" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="designation">Designation</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Designation</div>
                                </div>
                                <input type="text" className="form-control" id="designation" name="experienceInfoBeans[0].designation" placeholder="Enter Designation" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="joining_date">Joining Date</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Joining Date</div>
                                </div>
                                <input type="date" className="form-control" id="joining_date" name="experienceInfoBeans[0].joiningDate" placeholder="dd-mm-yyyy" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="leaving_date">Leaving Date</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Leaving Date</div>
                                </div>
                                <input type="date" className="form-control" id="leaving_date" name="experienceInfoBeans[0].releavingDate" placeholder="dd-mm-yyyy" />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default Experience
