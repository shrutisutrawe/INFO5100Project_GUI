package dao;

import utils.Utils;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.NewJDBC;
import vo.Car;

public class VehicleDAO {

    private NewJDBC newJDBC;

    public VehicleDAO() {
        try {
            this.newJDBC = NewJDBC.getInstance();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Car getById(int id) throws SQLException {
        final ResultSet query = newJDBC.query("select * from vehicle_test vt inner join model_test mot on vt.model_id = mot.model_id\n" +
                "inner join make_test mat on vt.make_id = mat.make_id where vehicle_id = ?", new String[]{String.valueOf(id)});
        List<Map<String, Object>> res = Utils.resultSetToList(query);
        Car car = Utils.transToCar(res.get(0));
        return car;
    }

    public static void main(String[] args) throws SQLException {
        VehicleDAO vehicleDAO = new VehicleDAO();
        final Car byId = vehicleDAO.getById(1);
        System.out.println(byId);
    }
}