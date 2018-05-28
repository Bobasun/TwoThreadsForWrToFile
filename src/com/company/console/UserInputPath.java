package com.company.console;

import java.util.Scanner;

public class UserInputPath implements IUIPath {

    private String path;

    public UserInputPath(){
        getPathFromUser();
    }

    private void getPathFromUser()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter path: ");
        path = sc.nextLine();
    }

    @Override
    public String getPath() {
        return path;
    }


}
