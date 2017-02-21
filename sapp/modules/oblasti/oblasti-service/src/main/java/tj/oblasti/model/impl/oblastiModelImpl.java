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

package tj.oblasti.model.impl;

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

import tj.oblasti.model.oblasti;
import tj.oblasti.model.oblastiModel;
import tj.oblasti.model.oblastiSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the oblasti service. Represents a row in the &quot;sapp.oblasti&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link oblastiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link oblastiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see oblastiImpl
 * @see oblasti
 * @see oblastiModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class oblastiModelImpl extends BaseModelImpl<oblasti>
	implements oblastiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a oblasti model instance should use the {@link oblasti} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.oblasti";
	public static final Object[][] TABLE_COLUMNS = {
			{ "oblasti_id", Types.BIGINT },
			{ "nazvanie", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("oblasti_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("nazvanie", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.oblasti (oblasti_id LONG not null primary key,nazvanie VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table sapp.oblasti";
	public static final String ORDER_BY_JPQL = " ORDER BY oblasti.oblasti_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.oblasti.oblasti_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.oblasti.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.oblasti.model.oblasti"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.oblasti.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.oblasti.model.oblasti"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static oblasti toModel(oblastiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		oblasti model = new oblastiImpl();

		model.setOblasti_id(soapModel.getOblasti_id());
		model.setNazvanie(soapModel.getNazvanie());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<oblasti> toModels(oblastiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<oblasti> models = new ArrayList<oblasti>(soapModels.length);

		for (oblastiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.oblasti.service.util.ServiceProps.get(
				"lock.expiration.time.tj.oblasti.model.oblasti"));

	public oblastiModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _oblasti_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOblasti_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _oblasti_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return oblasti.class;
	}

	@Override
	public String getModelClassName() {
		return oblasti.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("oblasti_id", getOblasti_id());
		attributes.put("nazvanie", getNazvanie());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oblasti_id = (Long)attributes.get("oblasti_id");

		if (oblasti_id != null) {
			setOblasti_id(oblasti_id);
		}

		String nazvanie = (String)attributes.get("nazvanie");

		if (nazvanie != null) {
			setNazvanie(nazvanie);
		}
	}

	@JSON
	@Override
	public long getOblasti_id() {
		return _oblasti_id;
	}

	@Override
	public void setOblasti_id(long oblasti_id) {
		_oblasti_id = oblasti_id;
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
			oblasti.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public oblasti toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (oblasti)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		oblastiImpl oblastiImpl = new oblastiImpl();

		oblastiImpl.setOblasti_id(getOblasti_id());
		oblastiImpl.setNazvanie(getNazvanie());

		oblastiImpl.resetOriginalValues();

		return oblastiImpl;
	}

	@Override
	public int compareTo(oblasti oblasti) {
		long primaryKey = oblasti.getPrimaryKey();

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

		if (!(obj instanceof oblasti)) {
			return false;
		}

		oblasti oblasti = (oblasti)obj;

		long primaryKey = oblasti.getPrimaryKey();

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
	public CacheModel<oblasti> toCacheModel() {
		oblastiCacheModel oblastiCacheModel = new oblastiCacheModel();

		oblastiCacheModel.oblasti_id = getOblasti_id();

		oblastiCacheModel.nazvanie = getNazvanie();

		String nazvanie = oblastiCacheModel.nazvanie;

		if ((nazvanie != null) && (nazvanie.length() == 0)) {
			oblastiCacheModel.nazvanie = null;
		}

		return oblastiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{oblasti_id=");
		sb.append(getOblasti_id());
		sb.append(", nazvanie=");
		sb.append(getNazvanie());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("tj.oblasti.model.oblasti");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>oblasti_id</column-name><column-value><![CDATA[");
		sb.append(getOblasti_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nazvanie</column-name><column-value><![CDATA[");
		sb.append(getNazvanie());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = oblasti.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			oblasti.class
		};
	private long _oblasti_id;
	private String _nazvanie;
	private oblasti _escapedModel;
}