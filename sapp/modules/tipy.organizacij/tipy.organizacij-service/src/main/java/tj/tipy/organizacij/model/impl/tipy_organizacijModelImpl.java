/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.tipy.organizacij.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import tj.tipy.organizacij.model.tipy_organizacij;
import tj.tipy.organizacij.model.tipy_organizacijModel;
import tj.tipy.organizacij.model.tipy_organizacijSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the tipy_organizacij service. Represents a row in the &quot;sapp.tipy_organizacij&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link tipy_organizacijModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tipy_organizacijImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacijImpl
 * @see tipy_organizacij
 * @see tipy_organizacijModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class tipy_organizacijModelImpl extends BaseModelImpl<tipy_organizacij>
	implements tipy_organizacijModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tipy_organizacij model instance should use the {@link tipy_organizacij} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.tipy_organizacij";
	public static final Object[][] TABLE_COLUMNS = {
			{ "tipy_organizacij_id", Types.BIGINT },
			{ "nazvanie", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tipy_organizacij_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("nazvanie", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.tipy_organizacij (tipy_organizacij_id LONG not null primary key,nazvanie VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.tipy_organizacij";
	public static final String ORDER_BY_JPQL = " ORDER BY tipy_organizacij.tipy_organizacij_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.tipy_organizacij.tipy_organizacij_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.tipy.organizacij.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.tipy.organizacij.model.tipy_organizacij"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.tipy.organizacij.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.tipy.organizacij.model.tipy_organizacij"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static tipy_organizacij toModel(tipy_organizacijSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		tipy_organizacij model = new tipy_organizacijImpl();

		model.setTipy_organizacij_id(soapModel.getTipy_organizacij_id());
		model.setNazvanie(soapModel.getNazvanie());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<tipy_organizacij> toModels(
		tipy_organizacijSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<tipy_organizacij> models = new ArrayList<tipy_organizacij>(soapModels.length);

		for (tipy_organizacijSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.tipy.organizacij.service.util.ServiceProps.get(
				"lock.expiration.time.tj.tipy.organizacij.model.tipy_organizacij"));

	public tipy_organizacijModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tipy_organizacij_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTipy_organizacij_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipy_organizacij_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return tipy_organizacij.class;
	}

	@Override
	public String getModelClassName() {
		return tipy_organizacij.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tipy_organizacij_id", getTipy_organizacij_id());
		attributes.put("nazvanie", getNazvanie());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tipy_organizacij_id = (Long)attributes.get("tipy_organizacij_id");

		if (tipy_organizacij_id != null) {
			setTipy_organizacij_id(tipy_organizacij_id);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}
	}

	@JSON
	@Override
	public long getTipy_organizacij_id() {
		return _tipy_organizacij_id;
	}

	@Override
	public void setTipy_organizacij_id(long tipy_organizacij_id) {
		_tipy_organizacij_id = tipy_organizacij_id;
	}

	@JSON
	@Override
	public String getNazvanie() {
		if (_nazvanie == null) {
			return StringPool.BLANK;
		}
		else {
			return _nazvanie;
		}
	}

	@Override
	public void setNazvanie(String nazvanie) {
		_nazvanie = nazvanie;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			tipy_organizacij.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public tipy_organizacij toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (tipy_organizacij)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		tipy_organizacijImpl tipy_organizacijImpl = new tipy_organizacijImpl();

		tipy_organizacijImpl.setTipy_organizacij_id(getTipy_organizacij_id());
		tipy_organizacijImpl.setNazvanie(getNazvanie());

		tipy_organizacijImpl.resetOriginalValues();

		return tipy_organizacijImpl;
	}

	@Override
	public int compareTo(tipy_organizacij tipy_organizacij) {
		long primaryKey = tipy_organizacij.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof tipy_organizacij)) {
			return false;
		}

		tipy_organizacij tipy_organizacij = (tipy_organizacij)obj;

		long primaryKey = tipy_organizacij.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<tipy_organizacij> toCacheModel() {
		tipy_organizacijCacheModel tipy_organizacijCacheModel = new tipy_organizacijCacheModel();

		tipy_organizacijCacheModel.tipy_organizacij_id = getTipy_organizacij_id();

		tipy_organizacijCacheModel.nazvanie = getNazvanie();

		String nazvanie = tipy_organizacijCacheModel.nazvanie;

		if ((nazvanie != null) && (nazvanie.length() == 0)) {
			tipy_organizacijCacheModel.nazvanie = null;
		}

		return tipy_organizacijCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{tipy_organizacij_id=");
		sb.append(getTipy_organizacij_id());
		sb.append(", nazvanie=");
		sb.append(getNazvanie());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("tj.tipy.organizacij.model.tipy_organizacij");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tipy_organizacij_id</column-name><column-value><![CDATA[");
		sb.append(getTipy_organizacij_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nazvanie</column-name><column-value><![CDATA[");
		sb.append(getNazvanie());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = tipy_organizacij.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			tipy_organizacij.class
		};
	private long _tipy_organizacij_id;
	private String _nazvanie;
	private tipy_organizacij _escapedModel;
}