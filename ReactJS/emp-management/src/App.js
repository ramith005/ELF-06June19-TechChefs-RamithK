import React from 'react';
import Login from './components/login/Login';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import createEmployee from './components/createAccount/createEmployee';
import HomePage from './components/homePage/HomePage';

function App() {
  return (
    <Router>
      <Route exact path='/' 
     component={Login} />    
      <Route path='/createEmployee' component={createEmployee}></Route>
      <Route path='/HomePage' component={HomePage}></Route>
    </Router>
  );
}

export default App;
