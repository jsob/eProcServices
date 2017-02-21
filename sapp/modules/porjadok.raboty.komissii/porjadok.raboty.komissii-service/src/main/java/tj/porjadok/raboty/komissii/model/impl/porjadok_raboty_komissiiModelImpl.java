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

package tj.porjadok.raboty.komissii.model.impl;

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

import tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii;
import tj.porjadok.raboty.komissii.model.porjadok_raboty_komissiiModel;
import tj.porjadok.raboty.komissii.model.porjadok_raboty_komissiiSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the porjadok_raboty_komissii service. Represents a row in the &quot;sapp.porjadok_raboty_komissii&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link porjadok_raboty_komissiiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link porjadok_raboty_komissiiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see porjadok_raboty_komissiiImpl
 * @see porjadok_raboty_komissii
 * @see porjadok_raboty_komissiiModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class porjadok_raboty_komissiiModelImpl extends BaseModelImpl<porjadok_raboty_komissii>
	implements porjadok_raboty_komissiiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a porjadok_raboty_komissii model instance should use the {@link porjadok_raboty_komissii} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.porjadok_raboty_komissii";
	public static final Object[][] TABLE_COLUMNS = {
			{ "data_izmenenija", Types.TIMESTAMP },
			{ "data_podvedenija_itogov", Types.TIMESTAMP },
			{ "data_publikacii", Types.TIMESTAMP },
			{ "data_sozdanija", Types.TIMESTAMP },
			{ "izmenil", Types.BIGINT },
			{ "izvewenie_id", Types.BIGINT },
			{ "po_istecheniju_dnej", Types.BIGINT },
			{ "porjadok_raboty_komissii_id", Types.BIGINT },
			{ "sozdal", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("data_izmenenija", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("data_podvedenija_itogov", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("data_publikacii", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("data_sozdanija", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("izmenil", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("izvewenie_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("po_istecheniju_dnej", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("porjadok_raboty_komissii_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("sozdal", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.porjadok_raboty_komissii (data_izmenenija DATE null,data_podvedenija_itogov DATE null,data_publikacii DATE null,data_sozdanija DATE null,izmenil LONG,izvewenie_id LONG,po_istecheniju_dnej LONG,porjadok_raboty_komissii_id LONG not null primary key,sozdal LONG)";
	public static final String TABLE_SQL_DROP = "drop table sapp.porjadok_raboty_komissii";
	public static final String ORDER_BY_JPQL = " ORDER BY porjadok_raboty_komissii.porjadok_raboty_komissii_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.porjadok_raboty_komissii.porjadok_raboty_komissii_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.porjadok.raboty.komissii.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.porjadok.raboty.komissii.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static porjadok_raboty_komissii toModel(
		porjadok_raboty_komissiiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		porjadok_raboty_komissii model = new porjadok_raboty_komissiiImpl();

		model.setData_izmenenija(soapModel.getData_izmenenija());
		model.setData_podvedenija_itogov(soapModel.getData_podvedenija_itogov());
		model.setData_publikacii(soapModel.getData_publikacii());
		model.setData_sozdanija(soapModel.getData_sozdanija());
		model.setIzmenil(soapModel.getIzmenil());
		model.setIzvewenie_id(soapModel.getIzvewenie_id());
		model.setPo_istecheniju_dnej(soapModel.getPo_istecheniju_dnej());
		model.setPorjadok_raboty_komissii_id(soapModel.getPorjadok_raboty_komissii_id());
		model.setSozdal(soapModel.getSozdal());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<porjadok_raboty_komissii> toModels(
		porjadok_raboty_komissiiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<porjadok_raboty_komissii> models = new ArrayList<porjadok_raboty_komissii>(soapModels.length);

		for (porjadok_raboty_komissiiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.porjadok.raboty.komissii.service.util.ServiceProps.get(
				"lock.expiration.time.tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii"));

	public porjadok_raboty_komissiiModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _porjadok_raboty_komissii_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPorjadok_raboty_komissii_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _porjadok_raboty_komissii_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return porjadok_raboty_komissii.class;
	}

	@Override
	public String getModelClassName() {
		return porjadok_raboty_komissii.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_izmenenija", getData_izmenenija());
		attributes.put("data_podvedenija_itogov", getData_podvedenija_itogov());
		attributes.put("data_publikacii", getData_publikacii());
		attributes.put("data_sozdanija", getData_sozdanija());
		attributes.put("izmenil", getIzmenil());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("po_istecheniju_dnej", getPo_istecheniju_dnej());
		attributes.put("porjadok_raboty_komissii_id",
			getPorjadok_raboty_komissii_id());
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

		Date data_podvedenija_itogov = (Date)attributes.get(
				"data_podvedenija_itogov");

		if (data_podvedenija_itogov != null) {
			setData_podvedenija_itogov(data_podvedenija_itogov);
		}

		Date data_publikacii = (Date)attributes.get("data_publikacii");

		if (data_publikacii != null) {
			setData_publikacii(data_publikacii);
		}

		Date data_sozdanija = (Date)attributes.get("data_sozdanija");

		if (data_sozdanija != null) {
			setData_sozdanija(data_sozdanija);
		}

		Long izmenil = (Long)attributes.get("izmenil");

		if (izmenil != null) {
			setIzmenil(izmenil);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long po_istecheniju_dnej = (Long)attributes.get("po_istecheniju_dnej");

		if (po_istecheniju_dnej != null) {
			setPo_istecheniju_dnej(po_istecheniju_dnej);
		}

		Long porjadok_raboty_komissii_id = (Long)attributes.get(
				"porjadok_raboty_komissii_id");

		if (porjadok_raboty_komissii_id != null) {
			setPorjadok_raboty_komissii_id(porjadok_raboty_komissii_id);
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
	public Date getData_podvedenija_itogov() {
		return _data_podvedenija_itogov;
	}

	@Override
	public void setData_podvedenija_itogov(Date data_podvedenija_itogov) {
		_data_podvedenija_itogov = data_podvedenija_itogov;
	}

	@JSON
	@Override
	public Date getData_publikacii() {
		return _data_publikacii;
	}

	@Override
	public void setData_publikacii(Date data_publikacii) {
		_data_publikacii = data_publikacii;
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
	public long getIzvewenie_id() {
		return _izvewenie_id;
	}

	@Override
	public void setIzvewenie_id(long izvewenie_id) {
		_izvewenie_id = izvewenie_id;
	}

	@JSON
	@Override
	public long getPo_istecheniju_dnej() {
		return _po_istecheniju_dnej;
	}

	@Override
	public void setPo_istecheniju_dnej(long po_istecheniju_dnej) {
		_po_istecheniju_dnej = po_istecheniju_dnej;
	}

	@JSON
	@Override
	public long getPorjadok_raboty_komissii_id() {
		return _porjadok_raboty_komissii_id;
	}

	@Override
	public void setPorjadok_raboty_komissii_id(long porjadok_raboty_komissii_id) {
		_porjadok_raboty_komissii_id = porjadok_raboty_komissii_id;
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
			porjadok_raboty_komissii.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public porjadok_raboty_komissii toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (porjadok_raboty_komissii)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		porjadok_raboty_komissiiImpl porjadok_raboty_komissiiImpl = new porjadok_raboty_komissiiImpl();

		porjadok_raboty_komissiiImpl.setData_izmenenija(getData_izmenenija());
		porjadok_raboty_komissiiImpl.setData_podvedenija_itogov(getData_podvedenija_itogov());
		porjadok_raboty_komissiiImpl.setData_publikacii(getData_publikacii());
		porjadok_raboty_komissiiImpl.setData_sozdanija(getData_sozdanija());
		porjadok_raboty_komissiiImpl.setIzmenil(getIzmenil());
		porjadok_raboty_komissiiImpl.setIzvewenie_id(getIzvewenie_id());
		porjadok_raboty_komissiiImpl.setPo_istecheniju_dnej(getPo_istecheniju_dnej());
		porjadok_raboty_komissiiImpl.setPorjadok_raboty_komissii_id(getPorjadok_raboty_komissii_id());
		porjadok_raboty_komissiiImpl.setSozdal(getSozdal());

		porjadok_raboty_komissiiImpl.resetOriginalValues();

		return porjadok_raboty_komissiiImpl;
	}

	@Override
	public int compareTo(porjadok_raboty_komissii porjadok_raboty_komissii) {
		long primaryKey = porjadok_raboty_komissii.getPrimaryKey();

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

		if (!(obj instanceof porjadok_raboty_komissii)) {
			return false;
		}

		porjadok_raboty_komissii porjadok_raboty_komissii = (porjadok_raboty_komissii)obj;

		long primaryKey = porjadok_raboty_komissii.getPrimaryKey();

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
	public CacheModel<porjadok_raboty_komissii> toCacheModel() {
		porjadok_raboty_komissiiCacheModel porjadok_raboty_komissiiCacheModel = new porjadok_raboty_komissiiCacheModel();

		Date data_izmenenija = getData_izmenenija();

		if (data_izmenenija != null) {
			porjadok_raboty_komissiiCacheModel.data_izmenenija = data_izmenenija.getTime();
		}
		else {
			porjadok_raboty_komissiiCacheModel.data_izmenenija = Long.MIN_VALUE;
		}

		Date data_podvedenija_itogov = getData_podvedenija_itogov();

		if (data_podvedenija_itogov != null) {
			porjadok_raboty_komissiiCacheModel.data_podvedenija_itogov = data_podvedenija_itogov.getTime();
		}
		else {
			porjadok_raboty_komissiiCacheModel.data_podvedenija_itogov = Long.MIN_VALUE;
		}

		Date data_publikacii = getData_publikacii();

		if (data_publikacii != null) {
			porjadok_raboty_komissiiCacheModel.data_publikacii = data_publikacii.getTime();
		}
		else {
			porjadok_raboty_komissiiCacheModel.data_publikacii = Long.MIN_VALUE;
		}

		Date data_sozdanija = getData_sozdanija();

		if (data_sozdanija != null) {
			porjadok_raboty_komissiiCacheModel.data_sozdanija = data_sozdanija.getTime();
		}
		else {
			porjadok_raboty_komissiiCacheModel.data_sozdanija = Long.MIN_VALUE;
		}

		porjadok_raboty_komissiiCacheModel.izmenil = getIzmenil();

		porjadok_raboty_komissiiCacheModel.izvewenie_id = getIzvewenie_id();

		porjadok_raboty_komissiiCacheModel.po_istecheniju_dnej = getPo_istecheniju_dnej();

		porjadok_raboty_komissiiCacheModel.porjadok_raboty_komissii_id = getPorjadok_raboty_komissii_id();

		porjadok_raboty_komissiiCacheModel.sozdal = getSozdal();

		return porjadok_raboty_komissiiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{data_izmenenija=");
		sb.append(getData_izmenenija());
		sb.append(", data_podvedenija_itogov=");
		sb.append(getData_podvedenija_itogov());
		sb.append(", data_publikacii=");
		sb.append(getData_publikacii());
		sb.append(", data_sozdanija=");
		sb.append(getData_sozdanija());
		sb.append(", izmenil=");
		sb.append(getIzmenil());
		sb.append(", izvewenie_id=");
		sb.append(getIzvewenie_id());
		sb.append(", po_istecheniju_dnej=");
		sb.append(getPo_istecheniju_dnej());
		sb.append(", porjadok_raboty_komissii_id=");
		sb.append(getPorjadok_raboty_komissii_id());
		sb.append(", sozdal=");
		sb.append(getSozdal());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>data_izmenenija</column-name><column-value><![CDATA[");
		sb.append(getData_izmenenija());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data_podvedenija_itogov</column-name><column-value><![CDATA[");
		sb.append(getData_podvedenija_itogov());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>data_publikacii</column-name><column-value><![CDATA[");
		sb.append(getData_publikacii());
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
			"<column><column-name>izvewenie_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>po_istecheniju_dnej</column-name><column-value><![CDATA[");
		sb.append(getPo_istecheniju_dnej());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>porjadok_raboty_komissii_id</column-name><column-value><![CDATA[");
		sb.append(getPorjadok_raboty_komissii_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sozdal</column-name><column-value><![CDATA[");
		sb.append(getSozdal());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = porjadok_raboty_komissii.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			porjadok_raboty_komissii.class
		};
	private Date _data_izmenenija;
	private Date _data_podvedenija_itogov;
	private Date _data_publikacii;
	private Date _data_sozdanija;
	private long _izmenil;
	private long _izvewenie_id;
	private long _po_istecheniju_dnej;
	private long _porjadok_raboty_komissii_id;
	private long _sozdal;
	private porjadok_raboty_komissii _escapedModel;
}