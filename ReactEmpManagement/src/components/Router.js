import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import React, { Component } from 'react'


function Router(){
    return(
        <Router>
            <Link to="/createEmployee" className="offset-1 col-md-5 btn btn-outline-success" style={{borderRadius: '3px 0 0 3px', borderRight: 0}}>Create
                          Account</Link> 
             <Route path='/createEmployee' component={createEmployee}></Route>
        </Router>
    )
}
export default Router
