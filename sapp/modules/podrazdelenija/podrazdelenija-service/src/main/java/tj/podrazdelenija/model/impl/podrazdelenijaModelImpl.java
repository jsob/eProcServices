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

package tj.podrazdelenija.model.impl;

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

import tj.podrazdelenija.model.podrazdelenija;
import tj.podrazdelenija.model.podrazdelenijaModel;
import tj.podrazdelenija.model.podrazdelenijaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the podrazdelenija service. Represents a row in the &quot;sapp.podrazdelenija&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link podrazdelenijaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link podrazdelenijaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podrazdelenijaImpl
 * @see podrazdelenija
 * @see podrazdelenijaModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class podrazdelenijaModelImpl extends BaseModelImpl<podrazdelenija>
	implements podrazdelenijaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a podrazdelenija model instance should use the {@link podrazdelenija} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.podrazdelenija";
	public static final Object[][] TABLE_COLUMNS = {
			{ "data_izmenenija", Types.TIMESTAMP },
			{ "data_sozdanija", Types.TIMESTAMP },
			{ "izmenil", Types.BIGINT },
			{ "organizacija_id", Types.BIGINT },
			{ "podrazdelenie", Types.VARCHAR },
			{ "podrazdelenija_id", Types.BIGINT },
			{ "sozdal", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("data_izmenenija", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("data_sozdanija", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("izmenil", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("organizacija_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("podrazdelenie", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("podrazdelenija_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("sozdal", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.podrazdelenija (data_izmenenija DATE null,data_sozdanija DATE null,izmenil LONG,organizacija_id LONG,podrazdelenie VARCHAR(75) null,podrazdelenija_id LONG not null primary key,sozdal LONG)";
	public static final String TABLE_SQL_DROP = "drop table sapp.podrazdelenija";
	public static final String ORDER_BY_JPQL = " ORDER BY podrazdelenija.podrazdelenija_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.podrazdelenija.podrazdelenija_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.podrazdelenija.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.podrazdelenija.model.podrazdelenija"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.podrazdelenija.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.podrazdelenija.model.podrazdelenija"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static podrazdelenija toModel(podrazdelenijaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		podrazdelenija model = new podrazdelenijaImpl();

		model.setData_izmenenija(soapModel.getData_izmenenija());
		model.setData_sozdanija(soapModel.getData_sozdanija());
		model.setIzmenil(soapModel.getIzmenil());
		model.setOrganizacija_id(soapModel.getOrganizacija_id());
		model.setPodrazdelenie(soapModel.getPodrazdelenie());
		model.setPodrazdelenija_id(soapModel.getPodrazdelenija_id());
		model.setSozdal(soapModel.getSozdal());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<podrazdelenija> toModels(podrazdelenijaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<podrazdelenija> models = new ArrayList<podrazdelenija>(soapModels.length);

		for (podrazdelenijaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.podrazdelenija.service.util.ServiceProps.get(
				"lock.expiration.time.tj.podrazdelenija.model.podrazdelenija"));

	public podrazdelenijaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _podrazdelenija_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPodrazdelenija_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _podrazdelenija_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return podrazdelenija.class;
	}

	@Override
	public String getModelClassName() {
		return podrazdelenija.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izmenil", getIzmenil());
		attributes.put("organizacija_id", getOrganizacija_id());
		attributes.put("podrazdelenie", getPodrazdelenie());
		attributes.put("podrazdelenija_id", getPodrazdelenija_id());
		attributes.put("sozdal", getSozdal());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_izmenenija = (Date)attributes.get("data_izmenenija");

		if (data_izmenenija != null) {
			setData_izmenenija(data_izmenenija);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long organizacija_id = (Long)attributes.get("organizacija_id");

		if (organizacija_id != null) {
			setOrganizacija_id(organizacija_id);
		}

		String podrazdelenie = (String)attributes.get("podrazdelenie");

		if (podrazdelenie != null) {
			setPodrazdelenie(podrazdelenie);
		}

		Long podrazdelenija_id = (Long)attributes.get("podrazdelenija_id");

		if (podrazdelenija_id != null) {
			setPodrazdelenija_id(podrazdelenija_id);
		}

		Long sozdal = (Long)attributes.get("sozdal");

		if (sozdal != null) {
			setSozdal(sozdal);
		}
	}

	@JSON
	@Override
	public Date getData_izmenenija() {
		return _data_izmenenija;
	}

	@Override
	public void setData_izmenenija(Date data_izmenenija) {
		_data_izmenenija = data_izmenenija;
	}

	@JSON
	@Override
	public Date getData_sozdanija() {
		return _data_sozdanija;
	}

	@Override
	public void setData_sozdanija(Date data_sozdanija) {
		_data_sozdanija = data_sozdanija;
	}

	@JSON
	@Override
	public long getIzmenil() {
		return _izmenil;
	}

	@Override
	public void setIzmenil(long izmenil) {
		_izmenil = izmenil;
	}

	@JSON
	@Override
	public long getOrganizacija_id() {
		return _organizacija_id;
	}

	@Override
	public void setOrganizacija_id(long organizacija_id) {
		_organizacija_id = organizacija_id;
	}

	@JSON
	@Override
	public String getPodrazdelenie() {
		if (_podrazdelenie == null) {
			return StringPool.BLANK;
		}
		else {
			return _podrazdelenie;
		}
	}

	@Override
	public void setPodrazdelenie(String podrazdelenie) {
		_podrazdelenie = podrazdelenie;
	}

	@JSON
	@Override
	public long getPodrazdelenija_id() {
		return _podrazdelenija_id;
	}

	@Override
	public void setPodrazdelenija_id(long podrazdelenija_id) {
		_podrazdelenija_id = podrazdelenija_id;
	}

	@JSON
	@Override
	public long getSozdal() {
		return _sozdal;
	}

	@Override
	public void setSozdal(long sozdal) {
		_sozdal = sozdal;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			podrazdelenija.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public podrazdelenija toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (podrazdelenija)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		podrazdelenijaImpl podrazdelenijaImpl = new podrazdelenijaImpl();

		podrazdelenijaImpl.setData_izmenenija(getData_izmenenija());
		podrazdelenijaImpl.setData_sozdanija(getData_sozdanija());
		podrazdelenijaImpl.setIzmenil(getIzmenil());
		podrazdelenijaImpl.setOrganizacija_id(getOrganizacija_id());
		podrazdelenijaImpl.setPodrazdelenie(getPodrazdelenie());
		podrazdelenijaImpl.setPodrazdelenija_id(getPodrazdelenija_id());
		podrazdelenijaImpl.setSozdal(getSozdal());

		podrazdelenijaImpl.resetOriginalValues();

		return podrazdelenijaImpl;
	}

	@Override
	public int compareTo(podrazdelenija podrazdelenija) {
		long primaryKey = podrazdelenija.getPrimaryKey();

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

		if (!(obj instanceof podrazdelenija)) {
			return false;
		}

		podrazdelenija podrazdelenija = (podrazdelenija)obj;

		long primaryKey = podrazdelenija.getPrimaryKey();

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
	public CacheModel<podrazdelenija> toCacheModel() {
		podrazdelenijaCacheModel podrazdelenijaCacheModel = new podrazdelenijaCacheModel();

		Date data_izmenenija = getData_izmenenija();

		if (data_izmenenija != null) {
			podrazdelenijaCacheModel.data_izmenenija = data_izmenenija.getTime();
		}
		else {
			podrazdelenijaCacheModel.data_izmenenija = Long.MIN_VALUE;
		}

		Date data_sozdanija = getData_sozdanija();

		if (data_sozdanija != null) {
			podrazdelenijaCacheModel.data_sozdanija = data_sozdanija.getTime();
		}
		else {
			podrazdelenijaCacheModel.data_sozdanija = Long.MIN_VALUE;
		}

		podrazdelenijaCacheModel.izmenil = getIzmenil();

		podrazdelenijaCacheModel.organizacija_id = getOrganizacija_id();

		podrazdelenijaCacheModel.podrazdelenie = getPodrazdelenie();

		String podrazdelenie = podrazdelenijaCacheModel.podrazdelenie;

		if ((podrazdelenie != null) && (podrazdelenie.length() == 0)) {
			podrazdelenijaCacheModel.podrazdelenie = null;
		}

		podrazdelenijaCacheModel.podrazdelenija_id = getPodrazdelenija_id();

		podrazdelenijaCacheModel.sozdal = getSozdal();

		return podrazdelenijaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{data_izmenenija=");
		sb.append(getData_izmenenija());
		sb.append(", data_sozdanija=");
		sb.append(getData_sozdanija());
		sb.append(", izmenil=");
		sb.append(getIzmenil());
		sb.append(", organizacija_id=");
		sb.append(getOrganizacija_id());
		sb.append(", podrazdelenie=");
		sb.append(getPodrazdelenie());
		sb.append(", podrazdelenija_id=");
		sb.append(getPodrazdelenija_id());
		sb.append(", sozdal=");
		sb.append(getSozdal());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("tj.podrazdelenija.model.podrazdelenija");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>data_izmenenija</column-name><column-value><![CDATA[");
		sb.append(getData_izmenenija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data_sozdanija</column-name><column-value><![CDATA[");
		sb.append(getData_sozdanija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izmenil</column-name><column-value><![CDATA[");
		sb.append(getIzmenil());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizacija_id</column-name><column-value><![CDATA[");
		sb.append(getOrganizacija_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>podrazdelenie</column-name><column-value><![CDATA[");
		sb.append(getPodrazdelenie());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>podrazdelenija_id</column-name><column-value><![CDATA[");
		sb.append(getPodrazdelenija_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sozdal</column-name><column-value><![CDATA[");
		sb.append(getSozdal());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = podrazdelenija.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			podrazdelenija.class
		};
	private Date _data_izmenenija;
	private Date _data_sozdanija;
	private long _izmenil;
	private long _organizacija_id;
	private String _podrazdelenie;
	private long _podrazdelenija_id;
	private long _sozdal;
	private podrazdelenija _escapedModel;
}