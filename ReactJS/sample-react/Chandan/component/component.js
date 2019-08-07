/**
 * Component using Functions
 */
function Header(props){
    return React.createElement("h1",null,"Header");
}

function Footer(){
    return React.createElement("h1",null,"footer");
}

function Content(){
    return React.createElement("h1",null,"content");
}

const header = React.createElement(Header,{item:['bag']});
const footer = React.createElement(Footer);
const content = React.createElement(Content);
const myApp = React.createElement('div',null,header,content,footer);

ReactDOM.render(myApp,document.getElementById('app'));