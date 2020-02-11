/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.base;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.database.connection.Statement;

public class BaseStatementImpl implements Statement {

	private Connection connection;
	protected java.sql.Statement rawStatement;
	private boolean native_;

	protected BaseStatementImpl(Connection connection, java.sql.Statement statement, boolean native_) {
		this.connection = connection;
		this.rawStatement = statement;
		this.native_ = native_;
	}

	@Override
	public void close() {
		try {
			rawStatement.close();
		} catch (SQLException e) {
		}
	}

	@Override
	public boolean execute(String sql) throws SQLException {
		if (!native_)
			sql = connection.translate(sql);
		return rawStatement.execute(sql);
	}

	@Override
	public ResultSet executeQuery(String sql) throws SQLException {
		if (!native_)
			sql = connection.translate(sql);
		return rawStatement.executeQuery(sql);
	}

	@Override
	public int executeUpdate(String sql, boolean generatedKeys) throws SQLException {
		if (!native_)
			sql = connection.translate(sql);
		
		if(generatedKeys)
			return rawStatement.executeUpdate(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
		else
			return rawStatement.executeUpdate(sql);
	}

	@Override
	public void addBatch(String sql) throws SQLException {
		if (!native_)
			sql = connection.translate(sql);
		rawStatement.addBatch(sql);
	}

	@Override
	public void clearBatch() throws SQLException {
		rawStatement.clearBatch();
	}

	@Override
	public int[] executeBatch() throws SQLException {
		return rawStatement.executeBatch();
	}

	@Override
	public ResultSet getGeneratedKeys() throws SQLException {
		return rawStatement.getGeneratedKeys();
	}

	@Override
	public void setQueryTimeout(int seconds) {
		try {
			rawStatement.setQueryTimeout(seconds);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
