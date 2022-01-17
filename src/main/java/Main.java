import entty.Category;
import entty.Client;
import entty.Currency;
import entty.Supplier;
import repository.CategoryRepository;
import utils.DbConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        int operetion;
        do {
            System.out.println("==============================================");
            System.out.print("1.show currency    ");
            System.out.print("2.add currency  ");
            System.out.print("3.update  currency  ");
            System.out.println("4.delete currency");
            System.out.print("5.show category   ");
            System.out.print("6.add category   ");
            System.out.print("7.update  category  ");
            System.out.println("8.delete category");
            System.out.print("9.show client ");
            System.out.println("10.add client   11.update client   12.delete client ");
            System.out.println("13.show supplier   14.add supplier  15.update supplier 16.delete supplier");
            System.out.println("0.BACK");
            System.out.print("Select: ");
            operetion = new Scanner(System.in).nextInt();
            switch (operetion) {
                case 1 -> showCurrency();
                case 2 -> addCurrency();
                case 3 -> updatecurrency();
                case 4 -> deleteCurrency();
                case 5 -> showCategory();
                case 6 -> add_category();
                case 7 -> update_category();
                case 8 -> delete_category();
                case 9 -> show_client();
                case 10 -> add_client();
                case 11 -> updateClient();
                case 12 -> delete_client();
                case 13->  showSupplier();
                case 14->add_supplier();
                case 15->update_supplier();
                case 16->delete_supplier();
            }


        } while (operetion != 0);
//        System.out.println(CategoryRepository.getCategories());
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("nomi  kiriting ");
//        String name=scanner.nextLine();
//        System.out.println("type  kiriting ");
//       // scanner=new Scanner(System.in);
//        String type =scanner.nextLine();
//        System.out.println("yangi nomini kiriting");
//        String n_name=scanner.nextLine();
//        CategoryRepository.callFunction(name,type,n_name);
//        System.out.println("cho'tki brat ");
    }

    private static void delete_supplier() throws SQLException {
        showSupplier();
        Scanner scanner = new Scanner(System.in);
        System.out.println("klient raqamini   kiriting ");
        String name = scanner.nextLine();
        CategoryRepository.delete_Supplier(name);
        showSupplier();
    }

    private static void showSupplier() throws SQLException {
        for (Supplier supplier : CategoryRepository.getSupplier()) {
            System.out.println(supplier);
        }
    }

    private static void delete_client() throws SQLException {
        show_client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("klient raqamini   kiriting ");
        String phone = scanner.nextLine();
        CategoryRepository.delete_client(phone);
        show_client();
    }

    private static void add_client() throws SQLException {
        show_client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomini kiriting ");
        String name = scanner.nextLine();
        System.out.print("Telefon raqamni kiritng ");
        String phone = scanner.nextLine();
        CategoryRepository.addClient(name, phone);
        show_client();
    }

    private static void updateClient() throws SQLException {
        show_client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name client");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter new name ");
        String n_name = scanner.nextLine();
        System.out.println("Enter new phone number");
        String phone = scanner.nextLine();
        CategoryRepository.update_client(name, n_name, phone);
    }

    private static void show_client() throws SQLException {
        for (Client client : CategoryRepository.getClient()) {
            System.out.println(client);
        }
    }

    private static void delete_category() throws SQLException {
        showCategory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomi  kiriting ");
        String name = scanner.nextLine();
        CategoryRepository.delete_category(name);
        showCategory();
    }

    private static void showCategory() throws SQLException {
        for (Category category : CategoryRepository.getCategory()) {
            System.out.println(category);
        }
    }

    private static void update_category() throws SQLException {
        showCategory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomi  kiriting ");
        String name = scanner.nextLine();
        System.out.println("yangi nom kiriting ");
        String n_name = new Scanner(System.in).nextLine();
        CategoryRepository.update_category(name, n_name);
        showCategory();
    }

    private static void deleteCurrency() throws SQLException {
        showCurrency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomi  kiriting ");
        String name = scanner.nextLine();
        CategoryRepository.delete_Currency(name);
        showCurrency();
    }

    private static void updatecurrency() throws SQLException {
        showCurrency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomi  kiriting ");
        String name = scanner.nextLine();
        System.out.println("yangi nom kiriting ");
        String n_name = new Scanner(System.in).nextLine();
        CategoryRepository.updateCurrency(name, n_name);
        showCurrency();
    }
    private static void update_supplier() throws SQLException {
        showSupplier();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomi  kiriting ");
        String name = scanner.nextLine();
        System.out.println("yangi nom kiriting ");
        String n_name = new Scanner(System.in).nextLine();
        CategoryRepository.update_Supplier(name, n_name);
        showSupplier();
    }

    private static void addCurrency() throws SQLException {
        showCurrency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomi  kiriting ");
        String name = scanner.nextLine();
        CategoryRepository.addCurrency(name);
    }

    private static void showCurrency() throws SQLException {
        for (Currency currency : CategoryRepository.getCurrency()) {
            System.out.println(currency);
        }
    }

    private static void add_category() throws SQLException {
        showCategory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomi  kiriting ");
        String name = scanner.nextLine();
        CategoryRepository.add_Category(name);
        showCategory();
    }
    private static void add_supplier() throws SQLException {
        showSupplier();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nomi  kiriting ");
        String name = scanner.nextLine();
        CategoryRepository.add_supplier(name);
        showSupplier();
    }

}
