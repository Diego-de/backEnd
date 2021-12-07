import React, {Component} from "react";
import './results.css';
import pointGeral from './photos/pointGeral.png'

export default class Result extends Component {
    render () {
        return (
          <div className = "resultadogeral">
              <h2>Resultado Geral</h2>
              <img id = "img" src = {pointGeral}/>
          </div>
        );
    }
    
}