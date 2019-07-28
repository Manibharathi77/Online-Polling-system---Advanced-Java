package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.auth.Authen;
import com.p.Party;
import com.reg.Registration;

public class Dao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	// id,name, age, gender, location, ph, party
	// party, count
	// created method to insert into the database.
	public int saveRegistration(Registration reg) {
		return template.update("insert into details(name, age, gender, location, ph, party) values ('" + reg.getName()
				+ "' , '" + reg.getAge() + "', '" + reg.getGender() + "', '" + reg.getLocation() + "', '" + reg.getPh()
				+ "', '" + reg.getParty() + "') ");
	}

	// create method to display all the data
	public List<Party> getallParty() {
		return template.query("select * from party", new RowMapper<Party>() {
			public Party mapRow(ResultSet rs, int row) throws SQLException {
				Party p = new Party();
				p.setParty(rs.getString(1));
				return p;
			}
		});
		// to increase the value by 1
	}

	public List<Party> getResult() {
		return template.query("select * from party", new RowMapper<Party>() {
			public Party mapRow(ResultSet rs, int row) throws SQLException {
				Party p = new Party();
				p.setParty(rs.getString(1));
				p.setCount(rs.getInt(2));
				return p;
			}
		});

	}

	public int increasevote(String party) {
		String qry = "update party set count = count+1 where party ='" + party + "' ";
		return template.update(qry);
	}

	public List<Authen> authcheck(Authen auth) {
	return	template.query("select * from auth where name = '" + auth.getUsername() + "' && password = '"
				+ auth.getPassword() + "' ", new RowMapper<Authen>() {
					public Authen mapRow(ResultSet rs, int row) throws SQLException {
						Authen a = new Authen();
						a.setUsername(rs.getString(1));
						a.setPassword(rs.getString(2));
						return a;
					}
				});
	}

	public int savePartyName(Registration reg) {
		return template.update("insert into party (party, count) values ('" + reg.getParty() + "', 0) ");
	}

	// check username availability

	// public boolean checkUsernameUnique(Registration reg) {
	// boolean result = true;
	// String sql = "SELECT * FROM details WHERE name = '"+reg.getName()+"' ";
	// int count = template.queryForObject(
	// sql, new Object[]{reg.getName()}, Integer.class);
	// if (count > 0) {
	// result = false;
	// log.info("username already available");
	// }
	// log.info(result);
	// return result;
	// }

}
