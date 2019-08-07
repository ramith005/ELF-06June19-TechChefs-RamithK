/**
 * Components Using Class
 */
class Header extends React.Component {
    constructor(props){
        super(props);
        console.log(this.props);
    }
    render(){
        return React.createElement("h1",null,"Header");
    }
}

class Footer extends React.Component {
    render(){
        return React.createElement("h1",null,"footer");
    }
}

class Content extends React.Component {
    constructor(props){
        super(props);
        console.log(this.props);
    }

    render(){
        return React.createElement("ul",null,
            this.props.item.map((value,index) => React.createElement("li",{key:value},value)));
    }
}

const items = ['bag','pencil','book'];
const header = React.createElement(Header,{item:['bag']});
const footer = React.createElement(Footer);
const content = React.createElement(Content,{item:items});
const myApp = React.createElement('div',null,header,content,footer);

ReactDOM.render(myApp,document.getElementById('app'));
