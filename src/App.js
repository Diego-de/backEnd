import React, { Component }  from "react";
import './App.css'
import Result from "./components/results";
import ResultadoPorSkills from "./components/pointSkills";
import Logos from "./components/logos";
import Trilha from "./components/trilha";


class App extends Component {

  render () {
     const Linha = <hr className="linha"></hr>
  return (
     <div className="app">
         <Logos />  
         {Linha}
         <div className="container">
            <div id="result"><Result/></div>
            <div id="result"><Trilha/></div>
            <div id="result"><ResultadoPorSkills/></div> 
          </div>
      </div>
  );
 }
}
export default App;
