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

package tj.izvewenie.put.model.impl;

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

import tj.izvewenie.put.model.izvewenie_put;
import tj.izvewenie.put.model.izvewenie_putModel;
import tj.izvewenie.put.model.izvewenie_putSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the izvewenie_put service. Represents a row in the &quot;sapp.izvewenie_put&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link izvewenie_putModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link izvewenie_putImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see izvewenie_putImpl
 * @see izvewenie_put
 * @see izvewenie_putModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class izvewenie_putModelImpl extends BaseModelImpl<izvewenie_put>
	implements izvewenie_putModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a izvewenie_put model instance should use the {@link izvewenie_put} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.izvewenie_put";
	public static final Object[][] TABLE_COLUMNS = {
			{ "izvewenie_id", Types.BIGINT },
			{ "izvewenie_put_id", Types.BIGINT },
			{ "put_a", Types.BIGINT },
			{ "put_b", Types.BIGINT },
			{ "put_c", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("izvewenie_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("izvewenie_put_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("put_a", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("put_b", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("put_c", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.izvewenie_put (izvewenie_id LONG,izvewenie_put_id LONG not null primary key,put_a LONG,put_b LONG,put_c VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.izvewenie_put";
	public static final String ORDER_BY_JPQL = " ORDER BY izvewenie_put.izvewenie_put_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.izvewenie_put.izvewenie_put_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.izvewenie.put.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.izvewenie.put.model.izvewenie_put"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.izvewenie.put.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.izvewenie.put.model.izvewenie_put"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static izvewenie_put toModel(izvewenie_putSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		izvewenie_put model = new izvewenie_putImpl();

		model.setIzvewenie_id(soapModel.getIzvewenie_id());
		model.setIzvewenie_put_id(soapModel.getIzvewenie_put_id());
		model.setPut_a(soapModel.getPut_a());
		model.setPut_b(soapModel.getPut_b());
		model.setPut_c(soapModel.getPut_c());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<izvewenie_put> toModels(izvewenie_putSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<izvewenie_put> models = new ArrayList<izvewenie_put>(soapModels.length);

		for (izvewenie_putSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.izvewenie.put.service.util.ServiceProps.get(
				"lock.expiration.time.tj.izvewenie.put.model.izvewenie_put"));

	public izvewenie_putModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _izvewenie_put_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIzvewenie_put_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _izvewenie_put_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return izvewenie_put.class;
	}

	@Override
	public String getModelClassName() {
		return izvewenie_put.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("izvewenie_put_id", getIzvewenie_put_id());
		attributes.put("put_a", getPut_a());
		attributes.put("put_b", getPut_b());
		attributes.put("put_c", getPut_c());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long izvewenie_put_id = (Long)attributes.get("izvewenie_put_id");

		if (izvewenie_put_id != null) {
			setIzvewenie_put_id(izvewenie_put_id);
		}

		Long put_a = (Long)attributes.get("put_a");

		if (put_a != null) {
			setPut_a(put_a);
		}

		Long put_b = (Long)attributes.get("put_b");

		if (put_b != null) {
			setPut_b(put_b);
		}

		String put_c = (String)attributes.get("put_c");

		if (put_c != null) {
			setPut_c(put_c);
		}
	}

	@JSON
	@Override
	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	@JSON
	@Override
	public long getIzvewenie_put_id() {
		return _izvewenie_put_id;
	}

	@Override
	public void setIzvewenie_put_id(long izvewenie_put_id) {
		_izvewenie_put_id = izvewenie_put_id;
	}

	@JSON
	@Override
	public long getPut_a() {
		return _put_a;
	}

	@Override
	public void setPut_a(long put_a) {
		_put_a = put_a;
	}

	@JSON
	@Override
	public long getPut_b() {
		return _put_b;
	}

	@Override
	public void setPut_b(long put_b) {
		_put_b = put_b;
	}

	@JSON
	@Override
	public String getPut_c() {
		if (_put_c == null) {
			return StringPool.BLANK;
		}
		else {
			return _put_c;
		}
	}

	@Override
	public void setPut_c(String put_c) {
		_put_c = put_c;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			izvewenie_put.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public izvewenie_put toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (izvewenie_put)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		izvewenie_putImpl izvewenie_putImpl = new izvewenie_putImpl();

		izvewenie_putImpl.setIzvewenie_id(getIzvewenie_id());
		izvewenie_putImpl.setIzvewenie_put_id(getIzvewenie_put_id());
		izvewenie_putImpl.setPut_a(getPut_a());
		izvewenie_putImpl.setPut_b(getPut_b());
		izvewenie_putImpl.setPut_c(getPut_c());

		izvewenie_putImpl.resetOriginalValues();

		return izvewenie_putImpl;
	}

	@Override
	public int compareTo(izvewenie_put izvewenie_put) {
		long primaryKey = izvewenie_put.getPrimaryKey();

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

		if (!(obj instanceof izvewenie_put)) {
			return false;
		}

		izvewenie_put izvewenie_put = (izvewenie_put)obj;

		long primaryKey = izvewenie_put.getPrimaryKey();

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
	public CacheModel<izvewenie_put> toCacheModel() {
		izvewenie_putCacheModel izvewenie_putCacheModel = new izvewenie_putCacheModel();

		izvewenie_putCacheModel.izvewenie_id = getIzvewenie_id();

		izvewenie_putCacheModel.izvewenie_put_id = getIzvewenie_put_id();

		izvewenie_putCacheModel.put_a = getPut_a();

		izvewenie_putCacheModel.put_b = getPut_b();

		izvewenie_putCacheModel.put_c = getPut_c();

		String put_c = izvewenie_putCacheModel.put_c;

		if ((put_c != null) && (put_c.length() == 0)) {
			izvewenie_putCacheModel.put_c = null;
		}

		return izvewenie_putCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{izvewenie_id=");
		sb.append(getIzvewenie_id());
		sb.append(", izvewenie_put_id=");
		sb.append(getIzvewenie_put_id());
		sb.append(", put_a=");
		sb.append(getPut_a());
		sb.append(", put_b=");
		sb.append(getPut_b());
		sb.append(", put_c=");
		sb.append(getPut_c());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("tj.izvewenie.put.model.izvewenie_put");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>izvewenie_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izvewenie_put_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_put_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>put_a</column-name><column-value><![CDATA[");
		sb.append(getPut_a());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>put_b</column-name><column-value><![CDATA[");
		sb.append(getPut_b());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>put_c</column-name><column-value><![CDATA[");
		sb.append(getPut_c());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = izvewenie_put.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			izvewenie_put.class
		};
	private long _izvewenie_id;
	private long _izvewenie_put_id;
	private long _put_a;
	private long _put_b;
	private String _put_c;
	private izvewenie_put _escapedModel;
}