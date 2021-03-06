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

package tj.rezultat.rassmotrenija.pretenzii.model.impl;

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

import tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii;
import tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenziiModel;
import tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenziiSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the rezultat_rassmotrenija_pretenzii service. Represents a row in the &quot;sapp.rezultat_rassmotrenija_pretenzii&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link rezultat_rassmotrenija_pretenziiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link rezultat_rassmotrenija_pretenziiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rezultat_rassmotrenija_pretenziiImpl
 * @see rezultat_rassmotrenija_pretenzii
 * @see rezultat_rassmotrenija_pretenziiModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class rezultat_rassmotrenija_pretenziiModelImpl extends BaseModelImpl<rezultat_rassmotrenija_pretenzii>
	implements rezultat_rassmotrenija_pretenziiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rezultat_rassmotrenija_pretenzii model instance should use the {@link rezultat_rassmotrenija_pretenzii} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.rezultat_rassmotrenija_pretenzii";
	public static final Object[][] TABLE_COLUMNS = {
			{ "data_zagruzki", Types.TIMESTAMP },
			{ "imja_fajla", Types.VARCHAR },
			{ "izvewenie_id", Types.BIGINT },
			{ "lot_id", Types.BIGINT },
			{ "nazvanie_dokumenta", Types.VARCHAR },
			{ "postavwik_id", Types.BIGINT },
			{ "rezultat_rassmotrenija_pretenzii_id", Types.BIGINT },
			{ "zagruzil", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("data_zagruzki", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("imja_fajla", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("izvewenie_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("lot_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("nazvanie_dokumenta", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("postavwik_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("rezultat_rassmotrenija_pretenzii_id",
			Types.BIGINT);
		TABLE_COLUMNS_MAP.put("zagruzil", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.rezultat_rassmotrenija_pretenzii (data_zagruzki DATE null,imja_fajla VARCHAR(75) null,izvewenie_id LONG,lot_id LONG,nazvanie_dokumenta VARCHAR(75) null,postavwik_id LONG,rezultat_rassmotrenija_pretenzii_id LONG not null primary key,zagruzil LONG)";
	public static final String TABLE_SQL_DROP = "drop table sapp.rezultat_rassmotrenija_pretenzii";
	public static final String ORDER_BY_JPQL = " ORDER BY rezultat_rassmotrenija_pretenzii.rezultat_rassmotrenija_pretenzii_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.rezultat_rassmotrenija_pretenzii.rezultat_rassmotrenija_pretenzii_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.rezultat.rassmotrenija.pretenzii.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.rezultat.rassmotrenija.pretenzii.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static rezultat_rassmotrenija_pretenzii toModel(
		rezultat_rassmotrenija_pretenziiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		rezultat_rassmotrenija_pretenzii model = new rezultat_rassmotrenija_pretenziiImpl();

		model.setData_zagruzki(soapModel.getData_zagruzki());
		model.setImja_fajla(soapModel.getImja_fajla());
		model.setIzvewenie_id(soapModel.getIzvewenie_id());
		model.setLot_id(soapModel.getLot_id());
		model.setNazvanie_dokumenta(soapModel.getNazvanie_dokumenta());
		model.setPostavwik_id(soapModel.getPostavwik_id());
		model.setRezultat_rassmotrenija_pretenzii_id(soapModel.getRezultat_rassmotrenija_pretenzii_id());
		model.setZagruzil(soapModel.getZagruzil());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<rezultat_rassmotrenija_pretenzii> toModels(
		rezultat_rassmotrenija_pretenziiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<rezultat_rassmotrenija_pretenzii> models = new ArrayList<rezultat_rassmotrenija_pretenzii>(soapModels.length);

		for (rezultat_rassmotrenija_pretenziiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.rezultat.rassmotrenija.pretenzii.service.util.ServiceProps.get(
				"lock.expiration.time.tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii"));

	public rezultat_rassmotrenija_pretenziiModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _rezultat_rassmotrenija_pretenzii_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRezultat_rassmotrenija_pretenzii_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rezultat_rassmotrenija_pretenzii_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return rezultat_rassmotrenija_pretenzii.class;
	}

	@Override
	public String getModelClassName() {
		return rezultat_rassmotrenija_pretenzii.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_zagruzki", getData_zagruzki());
		attributes.put("imja_fajla", getImja_fajla());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("lot_id", getLot_id());
		attributes.put("nazvanie_dokumenta", getNazvanie_dokumenta());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("rezultat_rassmotrenija_pretenzii_id",
			getRezultat_rassmotrenija_pretenzii_id());
		attributes.put("zagruzil", getZagruzil());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_zagruzki = (Date)attributes.get("data_zagruzki");

		if (data_zagruzki != null) {
			setData_zagruzki(data_zagruzki);
		}

		String imja_fajla = (String)attributes.get("imja_fajla");

		if (imja_fajla != null) {
			setImja_fajla(imja_fajla);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		String nazvanie_dokumenta = (String)attributes.get("nazvanie_dokumenta");

		if (nazvanie_dokumenta != null) {
			setNazvanie_dokumenta(nazvanie_dokumenta);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Long rezultat_rassmotrenija_pretenzii_id = (Long)attributes.get(
				"rezultat_rassmotrenija_pretenzii_id");

		if (rezultat_rassmotrenija_pretenzii_id != null) {
			setRezultat_rassmotrenija_pretenzii_id(rezultat_rassmotrenija_pretenzii_id);
		}

		Long zagruzil = (Long)attributes.get("zagruzil");

		if (zagruzil != null) {
			setZagruzil(zagruzil);
		}
	}

	@JSON
	@Override
	public Date getData_zagruzki() {
		return _data_zagruzki;
	}

	@Override
	public void setData_zagruzki(Date data_zagruzki) {
		_data_zagruzki = data_zagruzki;
	}

	@JSON
	@Override
	public String getImja_fajla() {
		if (_imja_fajla == null) {
			return StringPool.BLANK;
		}
		else {
			return _imja_fajla;
		}
	}

	@Override
	public void setImja_fajla(String imja_fajla) {
		_imja_fajla = imja_fajla;
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
	public long getLot_id() {
		return _lot_id;
	}

	@Override
	public void setLot_id(long lot_id) {
		_lot_id = lot_id;
	}

	@JSON
	@Override
	public String getNazvanie_dokumenta() {
		if (_nazvanie_dokumenta == null) {
			return StringPool.BLANK;
		}
		else {
			return _nazvanie_dokumenta;
		}
	}

	@Override
	public void setNazvanie_dokumenta(String nazvanie_dokumenta) {
		_nazvanie_dokumenta = nazvanie_dokumenta;
	}

	@JSON
	@Override
	public long getPostavwik_id() {
		return _postavwik_id;
	}

	@Override
	public void setPostavwik_id(long postavwik_id) {
		_postavwik_id = postavwik_id;
	}

	@JSON
	@Override
	public long getRezultat_rassmotrenija_pretenzii_id() {
		return _rezultat_rassmotrenija_pretenzii_id;
	}

	@Override
	public void setRezultat_rassmotrenija_pretenzii_id(
		long rezultat_rassmotrenija_pretenzii_id) {
		_rezultat_rassmotrenija_pretenzii_id = rezultat_rassmotrenija_pretenzii_id;
	}

	@JSON
	@Override
	public long getZagruzil() {
		return _zagruzil;
	}

	@Override
	public void setZagruzil(long zagruzil) {
		_zagruzil = zagruzil;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			rezultat_rassmotrenija_pretenzii.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public rezultat_rassmotrenija_pretenzii toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (rezultat_rassmotrenija_pretenzii)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		rezultat_rassmotrenija_pretenziiImpl rezultat_rassmotrenija_pretenziiImpl =
			new rezultat_rassmotrenija_pretenziiImpl();

		rezultat_rassmotrenija_pretenziiImpl.setData_zagruzki(getData_zagruzki());
		rezultat_rassmotrenija_pretenziiImpl.setImja_fajla(getImja_fajla());
		rezultat_rassmotrenija_pretenziiImpl.setIzvewenie_id(getIzvewenie_id());
		rezultat_rassmotrenija_pretenziiImpl.setLot_id(getLot_id());
		rezultat_rassmotrenija_pretenziiImpl.setNazvanie_dokumenta(getNazvanie_dokumenta());
		rezultat_rassmotrenija_pretenziiImpl.setPostavwik_id(getPostavwik_id());
		rezultat_rassmotrenija_pretenziiImpl.setRezultat_rassmotrenija_pretenzii_id(getRezultat_rassmotrenija_pretenzii_id());
		rezultat_rassmotrenija_pretenziiImpl.setZagruzil(getZagruzil());

		rezultat_rassmotrenija_pretenziiImpl.resetOriginalValues();

		return rezultat_rassmotrenija_pretenziiImpl;
	}

	@Override
	public int compareTo(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii) {
		long primaryKey = rezultat_rassmotrenija_pretenzii.getPrimaryKey();

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

		if (!(obj instanceof rezultat_rassmotrenija_pretenzii)) {
			return false;
		}

		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii = (rezultat_rassmotrenija_pretenzii)obj;

		long primaryKey = rezultat_rassmotrenija_pretenzii.getPrimaryKey();

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
	public CacheModel<rezultat_rassmotrenija_pretenzii> toCacheModel() {
		rezultat_rassmotrenija_pretenziiCacheModel rezultat_rassmotrenija_pretenziiCacheModel =
			new rezultat_rassmotrenija_pretenziiCacheModel();

		Date data_zagruzki = getData_zagruzki();

		if (data_zagruzki != null) {
			rezultat_rassmotrenija_pretenziiCacheModel.data_zagruzki = data_zagruzki.getTime();
		}
		else {
			rezultat_rassmotrenija_pretenziiCacheModel.data_zagruzki = Long.MIN_VALUE;
		}

		rezultat_rassmotrenija_pretenziiCacheModel.imja_fajla = getImja_fajla();

		String imja_fajla = rezultat_rassmotrenija_pretenziiCacheModel.imja_fajla;

		if ((imja_fajla != null) && (imja_fajla.length() == 0)) {
			rezultat_rassmotrenija_pretenziiCacheModel.imja_fajla = null;
		}

		rezultat_rassmotrenija_pretenziiCacheModel.izvewenie_id = getIzvewenie_id();

		rezultat_rassmotrenija_pretenziiCacheModel.lot_id = getLot_id();

		rezultat_rassmotrenija_pretenziiCacheModel.nazvanie_dokumenta = getNazvanie_dokumenta();

		String nazvanie_dokumenta = rezultat_rassmotrenija_pretenziiCacheModel.nazvanie_dokumenta;

		if ((nazvanie_dokumenta != null) && (nazvanie_dokumenta.length() == 0)) {
			rezultat_rassmotrenija_pretenziiCacheModel.nazvanie_dokumenta = null;
		}

		rezultat_rassmotrenija_pretenziiCacheModel.postavwik_id = getPostavwik_id();

		rezultat_rassmotrenija_pretenziiCacheModel.rezultat_rassmotrenija_pretenzii_id = getRezultat_rassmotrenija_pretenzii_id();

		rezultat_rassmotrenija_pretenziiCacheModel.zagruzil = getZagruzil();

		return rezultat_rassmotrenija_pretenziiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{data_zagruzki=");
		sb.append(getData_zagruzki());
		sb.append(", imja_fajla=");
		sb.append(getImja_fajla());
		sb.append(", izvewenie_id=");
		sb.append(getIzvewenie_id());
		sb.append(", lot_id=");
		sb.append(getLot_id());
		sb.append(", nazvanie_dokumenta=");
		sb.append(getNazvanie_dokumenta());
		sb.append(", postavwik_id=");
		sb.append(getPostavwik_id());
		sb.append(", rezultat_rassmotrenija_pretenzii_id=");
		sb.append(getRezultat_rassmotrenija_pretenzii_id());
		sb.append(", zagruzil=");
		sb.append(getZagruzil());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append(
			"tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>data_zagruzki</column-name><column-value><![CDATA[");
		sb.append(getData_zagruzki());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imja_fajla</column-name><column-value><![CDATA[");
		sb.append(getImja_fajla());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izvewenie_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lot_id</column-name><column-value><![CDATA[");
		sb.append(getLot_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nazvanie_dokumenta</column-name><column-value><![CDATA[");
		sb.append(getNazvanie_dokumenta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postavwik_id</column-name><column-value><![CDATA[");
		sb.append(getPostavwik_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rezultat_rassmotrenija_pretenzii_id</column-name><column-value><![CDATA[");
		sb.append(getRezultat_rassmotrenija_pretenzii_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zagruzil</column-name><column-value><![CDATA[");
		sb.append(getZagruzil());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = rezultat_rassmotrenija_pretenzii.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			rezultat_rassmotrenija_pretenzii.class
		};
	private Date _data_zagruzki;
	private String _imja_fajla;
	private long _izvewenie_id;
	private long _lot_id;
	private String _nazvanie_dokumenta;
	private long _postavwik_id;
	private long _rezultat_rassmotrenija_pretenzii_id;
	private long _zagruzil;
	private rezultat_rassmotrenija_pretenzii _escapedModel;
}