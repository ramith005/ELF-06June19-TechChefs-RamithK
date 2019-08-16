import React, { Component } from 'react'

export class Education extends Component {
    render() {
        return (
            <div className="row">
                <div className="col-md-8 offset-2 card form1">
                    <div className="card-body">
                        <h4 className="text-center border-bottom">Educational Details</h4>
                        <br />
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="education_type">Education
                  Type</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Education Type</div>
                                </div>
                                <input type="text" className="form-control" required name="educationInfoBeans[0].educationPKBean.educationalType" placeholder="Enter Education Type" /> <span id="id-error" className="text-danger small" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="degree_type">Degree Type</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Degree Type</div>
                                </div>
                                <input type="text" className="form-control" id="degree_type" name="educationInfoBeans[0].degreeType" placeholder="Enter Degree Type" /> <span id="id-error" className="text-danger small" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="branch">Branch</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Branch</div>
                                </div>
                                <input type="text" className="form-control" id="branch" placeholder="Enter Degree Branch" /> <span id="id-error" className="text-danger small" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="college_name">College Name</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">College Name</div>
                                </div>
                                <input type="text" className="form-control" id="college_name" name="educationInfoBeans[0].collegeNM" placeholder="Enter College Name" /> <span id="id-error" className="text-danger small" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="university">University</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">University</div>
                                </div>
                                <input type="text" className="form-control" id="university" name="educationInfoBeans[0].university" placeholder="Enter University Name" /> <span id="id-error" className="text-danger small" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="yop">Year Of Passing</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Year Of Passing</div>
                                </div>
                                <input type="text" className="form-control" id="yop" name="educationInfoBeans[0].yop" placeholder="dd-mm-yyyy" />
                                <span id="id-error" className="text-danger small" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="percentage">Percentage</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Percentage</div>
                                </div>
                                <input type="text" className="form-control" id="percentage" name="educationInfoBeans[0].percentage" placeholder="Enter Percentage" /> <span id="id-error" className="text-danger small" />
                            </div>
                        </div>
                        <div className="col-auto">
                            <label className="sr-only" htmlFor="location">Location</label>
                            <div className="input-group mb-2">
                                <div className="input-group-prepend">
                                    <div className="input-group-text">Location</div>
                                </div>
                                <input type="text" className="form-control" id="location" name="educationInfoBeans[0].location" placeholder="Enter College Location" /> <span id="id-error" className="text-danger small" />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default Education
