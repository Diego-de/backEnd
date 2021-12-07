import React, {Component} from "react";
import './pointSkills.css'
import pointSkills from "./photos/pointSkills.png"


export default class ResultadoPorSkills extends Component {
    render () {
        return (
          <div className = "resultforskill">
             <img id="img-skills" src = {pointSkills} />
          </div>
        );
    }
}