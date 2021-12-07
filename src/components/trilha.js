import React, {Component} from "react";
import './trilha.css'
import trilha from "./photos/trilha.png"

export default class Trilha extends Component {
    render () {
        return (
            <div className="trilha">
                <h2>Sua trilha de aprendizagem</h2>
                <img id="img-trilha" src = {trilha}/>
            </div>
        );
    }
}