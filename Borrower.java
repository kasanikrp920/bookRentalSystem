package com.trimindtech.training.day08BookRental;

import java.util.ArrayList;
import java.util.List;

public class Borrower  extends BorrowerFile{
    public ArrayList<BorrowerFile> borrowerFiles= new ArrayList<>();

    public void addBorrower (BorrowerFile borrowerFile){
        borrowerFiles.add(borrowerFile);
        System.out.println("user details has been updated");
        System.out.println(borrowerFiles.toString());
    }
    public List<BorrowerFile> getAllBorrowerList() {

        return borrowerFiles;
    }


}
