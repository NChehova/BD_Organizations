package com.example.chhv.clb.OrganizationsBD.DAO;

import com.example.chhv.clb.OrganizationsBD.beans.Organization;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class OrganizationDAO implements DAO{

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int save(Organization organization) {
        String sql = "INSERT INTO course.organizations (name_organization, year_organization, phone_organization, address_organization, id_city, ir_type_organization) VALUES ('" +
                organization.getName_organization() + "', '" + organization.getYear_organization() +", '" + organization.getPhone_organization() +", '" + organization.getAddress_organization() +", '"
                + organization.getId_city() +", '" + organization.getId_type_organizations() +"');";
        return jdbcTemplate.update(sql);
    }


    public int update(Organization organization) {
        String sql = "UPDATE course.organizations SET name_organization = '" + organization.getName_organization() +"', year_organization = '" + organization.getYear_organization() +"', phone_organization = '"
        + organization.getPhone_organization() +"', address_organization = '" + organization.getAddress_organization() +"', id_city = '" + organization.getId_city() +"', id_type_organization = '" + organization.getId_type_organizations() + "';";
        return jdbcTemplate.update(sql);
    }


    public int delete(int id) {
        String sql = "DELETE FROM course.organizations where id_organization = " + id + ";";
        return jdbcTemplate.update(sql);
    }

    public Organization getOrganizationById(int id) {
        String sql = "SELECT * FROM course.organizations WHERE id_organization = ?;";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Organization>(Organization.class));
    }

    public List<Organization> getOrganizations() {
        return jdbcTemplate.query("SELECT * FROM course.organizations;", new RowMapper<Organization>() {
            @Override
            public Organization mapRow(ResultSet resultSet, int i) throws SQLException {
                Organization organization = new Organization();
                organization.setId(resultSet.getInt(1));
                organization.setName_organization(resultSet.getString(2));
                organization.setYear_organization(resultSet.getString(3));
                organization.setPhone_organization(resultSet.getString(4));
                organization.setAddress_organization(resultSet.getString(5));
                organization.setId_city(resultSet.getInt(6));
                organization.setId_type_organizations(resultSet.getInt(7));
                return organization;
            }
        });
    }
}
