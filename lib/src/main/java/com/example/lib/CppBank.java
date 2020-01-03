package com.example.lib;

import java.util.Scanner;

public class CppBank {
    Scanner scanner = new Scanner(System.in);
    private int Customer[];
    private int TransactionTime;

    public CppBank(int CustomerN, int TransactionTimeN) {
        while (CustomerN > 100) {
            System.out.println("����W�L100���U�ȡA�Э��s��J");
            CustomerN = Integer.parseInt(scanner.next());
        }
        while (TransactionTimeN > 10000) {
            System.out.println("����W�L10000�ӥ�����ơA�Э��s��J");
            TransactionTimeN = Integer.parseInt(scanner.next());
        }
        Customer = new int[CustomerN];
        TransactionTime = TransactionTimeN;
        for (int i = 0; i < CustomerN; i++) {               //��l��
            Customer[i] = 0;
        }
        for(int i=0;i<TransactionTime;i++){                 //����}�l
            int ThisTimeCustomer = Integer.parseInt(scanner.next());
            while (ThisTimeCustomer>CustomerN){
                System.out.println("�W�L���J���U�ȼơA�ЦA����J");
                ThisTimeCustomer = Integer.parseInt(scanner.next());
            }
            int Form_of_transaction = Integer.parseInt(scanner.next());
            while (Form_of_transaction!=1&&Form_of_transaction!=2){
                System.out.println("�ЦA����J�A�s�ڬ�1�B���ڬ�2");
                Form_of_transaction = Integer.parseInt(scanner.next());
            }
            int ThisTimeTransactionM = Integer.parseInt(scanner.next());
            switch (Form_of_transaction){
                case 1:
                    Customer[ThisTimeCustomer] += ThisTimeTransactionM;
                    break;
                case 2:
                    Customer[ThisTimeCustomer] -= ThisTimeTransactionM;
                    break;
            }
        }
        for (int i = 0; i < CustomerN; i++){
            System.out.printf("%d : %d \n",i,Customer[i]);
        }
    }

}
