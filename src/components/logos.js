import React, {Component} from "react";
import './logos.css'
import happenLogo from './photos/happenLogo.png' 
import notificacoes from './photos/notificacoes.png'
import download from './photos/download.png'
import config from './photos/config.png'
import user from './photos/user.png'


export default class Logos extends Component {
    render(){
        return (
            <div className="imagens">
               <img id="logos" src={happenLogo}></img> 
               <img id="logos" src={notificacoes}/>
               {/* <img id="logos" src={download}/> */}
               <img id="logos" src={config}/>
               <img id="logos" src={user}/>
            </div>   
        );
    }
}