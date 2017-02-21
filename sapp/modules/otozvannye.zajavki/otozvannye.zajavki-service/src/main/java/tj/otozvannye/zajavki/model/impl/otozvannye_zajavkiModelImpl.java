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

package tj.otozvannye.zajavki.model.impl;

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

import tj.otozvannye.zajavki.model.otozvannye_zajavki;
import tj.otozvannye.zajavki.model.otozvannye_zajavkiModel;
import tj.otozvannye.zajavki.model.otozvannye_zajavkiSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the otozvannye_zajavki service. Represents a row in the &quot;sapp.otozvannye_zajavki&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link otozvannye_zajavkiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link otozvannye_zajavkiImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see otozvannye_zajavkiImpl
 * @see otozvannye_zajavki
 * @see otozvannye_zajavkiModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class otozvannye_zajavkiModelImpl extends BaseModelImpl<otozvannye_zajavki>
	implements otozvannye_zajavkiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a otozvannye_zajavki model instance should use the {@link otozvannye_zajavki} interface instead.
	 */
	public static final String TABLE_NAME = "sapp.otozvannye_zajavki";
	public static final Object[][] TABLE_COLUMNS = {
			{ "data_otzyva", Types.TIMESTAMP },
			{ "itogo_za_tovar", Types.DOUBLE },
			{ "izvewenie_id", Types.BIGINT },
			{ "kolichestvo", Types.INTEGER },
			{ "lot_id", Types.BIGINT },
			{ "otozval", Types.BIGINT },
			{ "otozvannye_zajavki_id", Types.BIGINT },
			{ "postavwik_id", Types.BIGINT },
			{ "summa_za_edinicu_tovara", Types.DOUBLE },
			{ "tovar_id", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("data_otzyva", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("itogo_za_tovar", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("izvewenie_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("kolichestvo", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("lot_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("otozval", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("otozvannye_zajavki_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("postavwik_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("summa_za_edinicu_tovara", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("tovar_id", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table sapp.otozvannye_zajavki (data_otzyva DATE null,itogo_za_tovar DOUBLE,izvewenie_id LONG,kolichestvo INTEGER,lot_id LONG,otozval LONG,otozvannye_zajavki_id LONG not null primary key,postavwik_id LONG,summa_za_edinicu_tovara DOUBLE,tovar_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table sapp.otozvannye_zajavki";
	public static final String ORDER_BY_JPQL = " ORDER BY otozvannye_zajavki.otozvannye_zajavki_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sapp.otozvannye_zajavki.otozvannye_zajavki_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(tj.otozvannye.zajavki.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.tj.otozvannye.zajavki.model.otozvannye_zajavki"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(tj.otozvannye.zajavki.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.tj.otozvannye.zajavki.model.otozvannye_zajavki"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static otozvannye_zajavki toModel(otozvannye_zajavkiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		otozvannye_zajavki model = new otozvannye_zajavkiImpl();

		model.setData_otzyva(soapModel.getData_otzyva());
		model.setItogo_za_tovar(soapModel.getItogo_za_tovar());
		model.setIzvewenie_id(soapModel.getIzvewenie_id());
		model.setKolichestvo(soapModel.getKolichestvo());
		model.setLot_id(soapModel.getLot_id());
		model.setOtozval(soapModel.getOtozval());
		model.setOtozvannye_zajavki_id(soapModel.getOtozvannye_zajavki_id());
		model.setPostavwik_id(soapModel.getPostavwik_id());
		model.setSumma_za_edinicu_tovara(soapModel.getSumma_za_edinicu_tovara());
		model.setTovar_id(soapModel.getTovar_id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<otozvannye_zajavki> toModels(
		otozvannye_zajavkiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<otozvannye_zajavki> models = new ArrayList<otozvannye_zajavki>(soapModels.length);

		for (otozvannye_zajavkiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(tj.otozvannye.zajavki.service.util.ServiceProps.get(
				"lock.expiration.time.tj.otozvannye.zajavki.model.otozvannye_zajavki"));

	public otozvannye_zajavkiModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _otozvannye_zajavki_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOtozvannye_zajavki_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _otozvannye_zajavki_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return otozvannye_zajavki.class;
	}

	@Override
	public String getModelClassName() {
		return otozvannye_zajavki.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data_otzyva", getData_otzyva());
		attributes.put("itogo_za_tovar", getItogo_za_tovar());
		attributes.put("izvewenie_id", getIzvewenie_id());
		attributes.put("kolichestvo", getKolichestvo());
		attributes.put("lot_id", getLot_id());
		attributes.put("otozval", getOtozval());
		attributes.put("otozvannye_zajavki_id", getOtozvannye_zajavki_id());
		attributes.put("postavwik_id", getPostavwik_id());
		attributes.put("summa_za_edinicu_tovara", getSumma_za_edinicu_tovara());
		attributes.put("tovar_id", getTovar_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Date data_otzyva = (Date)attributes.get("data_otzyva");

		if (data_otzyva != null) {
			setData_otzyva(data_otzyva);
		}

		Double itogo_za_tovar = (Double)attributes.get("itogo_za_tovar");

		if (itogo_za_tovar != null) {
			setItogo_za_tovar(itogo_za_tovar);
		}

		Long izvewenie_id = (Long)attributes.get("izvewenie_id");

		if (izvewenie_id != null) {
			setIzvewenie_id(izvewenie_id);
		}

		Integer kolichestvo = (Integer)attributes.get("kolichestvo");

		if (kolichestvo != null) {
			setKolichestvo(kolichestvo);
		}

		Long lot_id = (Long)attributes.get("lot_id");

		if (lot_id != null) {
			setLot_id(lot_id);
		}

		Long otozval = (Long)attributes.get("otozval");

		if (otozval != null) {
			setOtozval(otozval);
		}

		Long otozvannye_zajavki_id = (Long)attributes.get(
				"otozvannye_zajavki_id");

		if (otozvannye_zajavki_id != null) {
			setOtozvannye_zajavki_id(otozvannye_zajavki_id);
		}

		Long postavwik_id = (Long)attributes.get("postavwik_id");

		if (postavwik_id != null) {
			setPostavwik_id(postavwik_id);
		}

		Double summa_za_edinicu_tovara = (Double)attributes.get(
				"summa_za_edinicu_tovara");

		if (summa_za_edinicu_tovara != null) {
			setSumma_za_edinicu_tovara(summa_za_edinicu_tovara);
		}

		Long tovar_id = (Long)attributes.get("tovar_id");

		if (tovar_id != null) {
			setTovar_id(tovar_id);
		}
	}

	@JSON
	@Override
	public Date getData_otzyva() {
		return _data_otzyva;
	}

	@Override
	public void setData_otzyva(Date data_otzyva) {
		_data_otzyva = data_otzyva;
	}

	@JSON
	@Override
	public double getItogo_za_tovar() {
		return _itogo_za_tovar;
	}

	@Override
	public void setItogo_za_tovar(double itogo_za_tovar) {
		_itogo_za_tovar = itogo_za_tovar;
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
	public int getKolichestvo() {
		return _kolichestvo;
	}

	@Override
	public void setKolichestvo(int kolichestvo) {
		_kolichestvo = kolichestvo;
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
	public long getOtozval() {
		return _otozval;
	}

	@Override
	public void setOtozval(long otozval) {
		_otozval = otozval;
	}

	@JSON
	@Override
	public long getOtozvannye_zajavki_id() {
		return _otozvannye_zajavki_id;
	}

	@Override
	public void setOtozvannye_zajavki_id(long otozvannye_zajavki_id) {
		_otozvannye_zajavki_id = otozvannye_zajavki_id;
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
	public double getSumma_za_edinicu_tovara() {
		return _summa_za_edinicu_tovara;
	}

	@Override
	public void setSumma_za_edinicu_tovara(double summa_za_edinicu_tovara) {
		_summa_za_edinicu_tovara = summa_za_edinicu_tovara;
	}

	@JSON
	@Override
	public long getTovar_id() {
		return _tovar_id;
	}

	@Override
	public void setTovar_id(long tovar_id) {
		_tovar_id = tovar_id;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			otozvannye_zajavki.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public otozvannye_zajavki toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (otozvannye_zajavki)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		otozvannye_zajavkiImpl otozvannye_zajavkiImpl = new otozvannye_zajavkiImpl();

		otozvannye_zajavkiImpl.setData_otzyva(getData_otzyva());
		otozvannye_zajavkiImpl.setItogo_za_tovar(getItogo_za_tovar());
		otozvannye_zajavkiImpl.setIzvewenie_id(getIzvewenie_id());
		otozvannye_zajavkiImpl.setKolichestvo(getKolichestvo());
		otozvannye_zajavkiImpl.setLot_id(getLot_id());
		otozvannye_zajavkiImpl.setOtozval(getOtozval());
		otozvannye_zajavkiImpl.setOtozvannye_zajavki_id(getOtozvannye_zajavki_id());
		otozvannye_zajavkiImpl.setPostavwik_id(getPostavwik_id());
		otozvannye_zajavkiImpl.setSumma_za_edinicu_tovara(getSumma_za_edinicu_tovara());
		otozvannye_zajavkiImpl.setTovar_id(getTovar_id());

		otozvannye_zajavkiImpl.resetOriginalValues();

		return otozvannye_zajavkiImpl;
	}

	@Override
	public int compareTo(otozvannye_zajavki otozvannye_zajavki) {
		long primaryKey = otozvannye_zajavki.getPrimaryKey();

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

		if (!(obj instanceof otozvannye_zajavki)) {
			return false;
		}

		otozvannye_zajavki otozvannye_zajavki = (otozvannye_zajavki)obj;

		long primaryKey = otozvannye_zajavki.getPrimaryKey();

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
	public CacheModel<otozvannye_zajavki> toCacheModel() {
		otozvannye_zajavkiCacheModel otozvannye_zajavkiCacheModel = new otozvannye_zajavkiCacheModel();

		Date data_otzyva = getData_otzyva();

		if (data_otzyva != null) {
			otozvannye_zajavkiCacheModel.data_otzyva = data_otzyva.getTime();
		}
		else {
			otozvannye_zajavkiCacheModel.data_otzyva = Long.MIN_VALUE;
		}

		otozvannye_zajavkiCacheModel.itogo_za_tovar = getItogo_za_tovar();

		otozvannye_zajavkiCacheModel.izvewenie_id = getIzvewenie_id();

		otozvannye_zajavkiCacheModel.kolichestvo = getKolichestvo();

		otozvannye_zajavkiCacheModel.lot_id = getLot_id();

		otozvannye_zajavkiCacheModel.otozval = getOtozval();

		otozvannye_zajavkiCacheModel.otozvannye_zajavki_id = getOtozvannye_zajavki_id();

		otozvannye_zajavkiCacheModel.postavwik_id = getPostavwik_id();

		otozvannye_zajavkiCacheModel.summa_za_edinicu_tovara = getSumma_za_edinicu_tovara();

		otozvannye_zajavkiCacheModel.tovar_id = getTovar_id();

		return otozvannye_zajavkiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{data_otzyva=");
		sb.append(getData_otzyva());
		sb.append(", itogo_za_tovar=");
		sb.append(getItogo_za_tovar());
		sb.append(", izvewenie_id=");
		sb.append(getIzvewenie_id());
		sb.append(", kolichestvo=");
		sb.append(getKolichestvo());
		sb.append(", lot_id=");
		sb.append(getLot_id());
		sb.append(", otozval=");
		sb.append(getOtozval());
		sb.append(", otozvannye_zajavki_id=");
		sb.append(getOtozvannye_zajavki_id());
		sb.append(", postavwik_id=");
		sb.append(getPostavwik_id());
		sb.append(", summa_za_edinicu_tovara=");
		sb.append(getSumma_za_edinicu_tovara());
		sb.append(", tovar_id=");
		sb.append(getTovar_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("tj.otozvannye.zajavki.model.otozvannye_zajavki");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>data_otzyva</column-name><column-value><![CDATA[");
		sb.append(getData_otzyva());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itogo_za_tovar</column-name><column-value><![CDATA[");
		sb.append(getItogo_za_tovar());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>izvewenie_id</column-name><column-value><![CDATA[");
		sb.append(getIzvewenie_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kolichestvo</column-name><column-value><![CDATA[");
		sb.append(getKolichestvo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lot_id</column-name><column-value><![CDATA[");
		sb.append(getLot_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otozval</column-name><column-value><![CDATA[");
		sb.append(getOtozval());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otozvannye_zajavki_id</column-name><column-value><![CDATA[");
		sb.append(getOtozvannye_zajavki_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postavwik_id</column-name><column-value><![CDATA[");
		sb.append(getPostavwik_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summa_za_edinicu_tovara</column-name><column-value><![CDATA[");
		sb.append(getSumma_za_edinicu_tovara());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tovar_id</column-name><column-value><![CDATA[");
		sb.append(getTovar_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = otozvannye_zajavki.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			otozvannye_zajavki.class
		};
	private Date _data_otzyva;
	private double _itogo_za_tovar;
	private long _izvewenie_id;
	private int _kolichestvo;
	private long _lot_id;
	private long _otozval;
	private long _otozvannye_zajavki_id;
	private long _postavwik_id;
	private double _summa_za_edinicu_tovara;
	private long _tovar_id;
	private otozvannye_zajavki _escapedModel;
}