package com.batch.ftp;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class CustomSPParameters implements PreparedStatementSetter{

@Override
public void setValues(PreparedStatement ps) throws SQLException {

	
   /* CallableStatement eventCallableSt=(CallableStatement)ps;
    eventCallableSt.registerOutParameter(1, java.sql.Types.SMALLINT);
    eventCallableSt.registerOutParameter(2, java.sql.Types.VARCHAR);
    eventCallableSt.registerOutParameter(3, java.sql.Types.INTEGER);
    eventCallableSt.registerOutParameter(4, java.sql.Types.CHAR);*/
}
}