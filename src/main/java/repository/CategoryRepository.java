package repository;

import entty.*;
import utils.DbConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    public static List<Currency> getCurrency() throws SQLException {
        Connection ulanish = DbConfig.ulanish();
        Statement statement = ulanish.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from currency");
        List<entty.Currency> currencyList = new ArrayList<>();
        while (resultSet.next()) {
            Currency currency = new Currency();

            //row bitta
//          System.out.println(resultSet.getInt(1));
//          System.out.println(resultSet.getString(2));
//          System.out.println(resultSet.getBoolean(3));
//          System.out.println("===========================================");

            currency.setId(resultSet.getInt(1));
            currency.setName(resultSet.getString(2));
            currency.setActive(resultSet.getBoolean(3));

            currencyList.add(currency);
        }
        // System.out.println(categoryList);
        return currencyList;
    }

    public static List<Category> getCategory() throws SQLException {
        Connection ulanish = DbConfig.ulanish();
        Statement statement = ulanish.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from category");
        List<Category> categoryList = new ArrayList<>();
        while (resultSet.next()) {
            Category category = new Category();
            //row bitta
//          System.out.println(resultSet.getInt(1));
//          System.out.println(resultSet.getString(2));
//          System.out.println(resultSet.getBoolean(3));
//          System.out.println("===========================================");

            category.setId(resultSet.getInt(1));
            category.setName(resultSet.getString(2));
            category.setActive(resultSet.getBoolean(3));

            categoryList.add(category);
        }
        return categoryList;
//    public static boolean addCategory(int id, String name ) throws SQLException {
//        //oddiy parametrli querylar
//        Connection connection=DbConfig.ulanish();
//        PreparedStatement preparedStatement=connection.prepareStatement(
//                "insert  into category values (?,?,?)");
//        preparedStatement.setInt(1,id);
//        preparedStatement.setString(2,name);
//        preparedStatement.setBoolean(3,true);
//
//        return preparedStatement.execute();
//    }

//    public  static Response callFunction(String i_name,String i_type  ,String n_name) throws SQLException {
//        Response response=new Response();
//
//        Connection connection =DbConfig.ulanish();
//        CallableStatement callableStatement=connection.prepareCall("{call category_crud(?,?,?,?,?) }");
//        callableStatement.setString(1,i_name);
//        callableStatement.setString(2,i_type);
//        callableStatement.setString(3,n_name);
//        callableStatement.registerOutParameter(4,Types.BOOLEAN);
//        callableStatement.registerOutParameter(5,Types.VARCHAR);
//        ResultSet resultSet=callableStatement.executeQuery();
//        while (resultSet.next()){
//            response.setSuccess(resultSet.getBoolean(1));
//           response.setMassage(resultSet.getString(2));
//
//        }
//        return response;
//    }
    }
    public static List<Supplier> getSupplier() throws SQLException {
        Connection ulanish = DbConfig.ulanish();
        Statement statement = ulanish.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from supplier");
        List<Supplier> supplierList = new ArrayList<>();
        while (resultSet.next()) {
            Supplier supplier=new Supplier();
            //row bitta
//          System.out.println(resultSet.getInt(1));
//          System.out.println(resultSet.getString(2));
//          System.out.println(resultSet.getBoolean(3));
//          System.out.println("===========================================");

            supplier.setId(resultSet.getInt(1));
            supplier.setName(resultSet.getString(2));
            supplier.setActive(resultSet.getBoolean(3));

            supplierList.add(supplier);
        }
        return supplierList;
//    public static boolean addCategory(int id, String name ) throws SQLException {
//        //oddiy parametrli querylar
//        Connection connection=DbConfig.ulanish();
//        PreparedStatement preparedStatement=connection.prepareStatement(
//                "insert  into category values (?,?,?)");
//        preparedStatement.setInt(1,id);
//        preparedStatement.setString(2,name);
//        preparedStatement.setBoolean(3,true);
//
//        return preparedStatement.execute();
//    }

//    public  static Response callFunction(String i_name,String i_type  ,String n_name) throws SQLException {
//        Response response=new Response();
//
//        Connection connection =DbConfig.ulanish();
//        CallableStatement callableStatement=connection.prepareCall("{call category_crud(?,?,?,?,?) }");
//        callableStatement.setString(1,i_name);
//        callableStatement.setString(2,i_type);
//        callableStatement.setString(3,n_name);
//        callableStatement.registerOutParameter(4,Types.BOOLEAN);
//        callableStatement.registerOutParameter(5,Types.VARCHAR);
//        ResultSet resultSet=callableStatement.executeQuery();
//        while (resultSet.next()){
//            response.setSuccess(resultSet.getBoolean(1));
//           response.setMassage(resultSet.getString(2));
//
//        }
//        return response;
//    }
    }

    public static List<Client> getClient() throws SQLException {
        Connection ulanish = DbConfig.ulanish();
        Statement statement = ulanish.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from client");
        List<Client> clientlist = new ArrayList<>();
        while (resultSet.next()) {
            Client client = new Client();

            //row bitta
//          System.out.println(resultSet.getInt(1));
//          System.out.println(resultSet.getString(2));
//          System.out.println(resultSet.getBoolean(3));
//          System.out.println("===========================================");

            client.setId(resultSet.getInt(1));
            client.setName(resultSet.getString(2));
            client.setActive(resultSet.getBoolean(3));
            client.setPhoneNumber(resultSet.getString(4));
            clientlist.add(client);
        }
        // System.out.println(categoryList);
        return clientlist;
    }

    public static Response delete_Currency(String name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call delete_currency(?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMassage(callableStatement.getString(3));
        return response;
    }
    public static Response delete_Supplier(String name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call delete_supplier(?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMassage(callableStatement.getString(3));
        return response;
    }

    public static Response updateCurrency(String name, String n_name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call update_currency(?,?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.setString(2, n_name);
        callableStatement.registerOutParameter(3, Types.BOOLEAN);
        callableStatement.registerOutParameter(4, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(3));
        response.setMassage(callableStatement.getString(4));
        return response;
    }
    public static Response update_Supplier(String name, String n_name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call update_supplier(?,?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.setString(2, n_name);
        callableStatement.registerOutParameter(3, Types.BOOLEAN);
        callableStatement.registerOutParameter(4, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(3));
        response.setMassage(callableStatement.getString(4));
        return response;
    }

    public static Response addCurrency(String name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call currency_add(?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMassage(callableStatement.getString(3));

        return response;
    }
    public static Response add_supplier(String name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call add_supplier(?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMassage(callableStatement.getString(3));

        return response;
    }
    public static Response add_Category(String name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call add_category(?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMassage(callableStatement.getString(3));

        return response;
    }

    public static Response update_category(String name, String n_name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call update_category(?,?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.setString(2, n_name);
        callableStatement.registerOutParameter(3, Types.BOOLEAN);
        callableStatement.registerOutParameter(4, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(3));
        response.setMassage(callableStatement.getString(4));
        return response;
    }

    public static Response delete_category(String name) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call delete_category(?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMassage(callableStatement.getString(3));
        return response;
    }

    public static Response update_client(String name, String n_name, String phone) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall("{call " +
                "update_client(?,?,?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.setString(2, n_name);
        callableStatement.setString(3, phone);
        callableStatement.registerOutParameter(4, Types.BOOLEAN);
        callableStatement.registerOutParameter(5, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(4));
        response.setMassage(callableStatement.getString(5));
        return response;
    }

    public static Response addClient(String name, String phone) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call add_client(?,?,?,?) }");
        callableStatement.setString(1, name);
        callableStatement.setString(2, phone);

        callableStatement.registerOutParameter(3, Types.BOOLEAN);
        callableStatement.registerOutParameter(4, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(3));
        response.setMassage(callableStatement.getString(4));

        return response;

    }

    public static Response delete_client(String phone) throws SQLException {
        Response response = new Response();
        Connection connection = DbConfig.ulanish();
        CallableStatement callableStatement = connection.prepareCall(
                "{call delete_client(?,?,?) }");
        callableStatement.setString(1, phone);
        callableStatement.registerOutParameter(2, Types.BOOLEAN);
        callableStatement.registerOutParameter(3, Types.VARCHAR);
        callableStatement.execute();
        response.setSuccess(callableStatement.getBoolean(2));
        response.setMassage(callableStatement.getString(3));
        return response;
    }
}
