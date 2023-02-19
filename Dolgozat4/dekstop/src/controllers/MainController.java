
package controllers;
import models.Restapi;
import views.Console;
import views.MainConsole;

/*
* File: MainController.java
* Author: Serényi Zsolt Ödön
* Copyright: 2023, Serényi Zsolt Ödön
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/OneBoyTwoGirl/
* Licenc: GNU GPL
*/

public class MainController {
    Console maincon;
    Restapi restapi;
    public MainController() {
        this.restapi = new Restapi();
        this.maincon = new Console(this.restapi);
        
    }
    
}