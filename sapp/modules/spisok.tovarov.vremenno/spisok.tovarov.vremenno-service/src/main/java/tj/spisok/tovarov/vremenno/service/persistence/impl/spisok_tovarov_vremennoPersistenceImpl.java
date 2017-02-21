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

package tj.spisok.tovarov.vremenno.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import tj.spisok.tovarov.vremenno.exception.NoSuchspisok_tovarov_vremennoException;
import tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoImpl;
import tj.spisok.tovarov.vremenno.model.impl.spisok_tovarov_vremennoModelImpl;
import tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno;
import tj.spisok.tovarov.vremenno.service.persistence.spisok_tovarov_vremennoPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the spisok_tovarov_vremenno service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov_vremennoPersistence
 * @see tj.spisok.tovarov.vremenno.service.persistence.spisok_tovarov_vremennoUtil
 * @generated
 */
@ProviderType
public class spisok_tovarov_vremennoPersistenceImpl extends BasePersistenceImpl<spisok_tovarov_vremenno>
	implements spisok_tovarov_vremennoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link spisok_tovarov_vremennoUtil} to access the spisok_tovarov_vremenno persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = spisok_tovarov_vremennoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarov_vremennoModelImpl.FINDER_CACHE_ENABLED,
			spisok_tovarov_vremennoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarov_vremennoModelImpl.FINDER_CACHE_ENABLED,
			spisok_tovarov_vremennoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarov_vremennoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public spisok_tovarov_vremennoPersistenceImpl() {
		setModelClass(spisok_tovarov_vremenno.class);
	}

	/**
	 * Caches the spisok_tovarov_vremenno in the entity cache if it is enabled.
	 *
	 * @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	 */
	@Override
	public void cacheResult(spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		entityCache.putResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarov_vremennoImpl.class,
			spisok_tovarov_vremenno.getPrimaryKey(), spisok_tovarov_vremenno);

		spisok_tovarov_vremenno.resetOriginalValues();
	}

	/**
	 * Caches the spisok_tovarov_vremennos in the entity cache if it is enabled.
	 *
	 * @param spisok_tovarov_vremennos the spisok_tovarov_vremennos
	 */
	@Override
	public void cacheResult(
		List<spisok_tovarov_vremenno> spisok_tovarov_vremennos) {
		for (spisok_tovarov_vremenno spisok_tovarov_vremenno : spisok_tovarov_vremennos) {
			if (entityCache.getResult(
						spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
						spisok_tovarov_vremennoImpl.class,
						spisok_tovarov_vremenno.getPrimaryKey()) == null) {
				cacheResult(spisok_tovarov_vremenno);
			}
			else {
				spisok_tovarov_vremenno.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all spisok_tovarov_vremennos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(spisok_tovarov_vremennoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the spisok_tovarov_vremenno.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		entityCache.removeResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarov_vremennoImpl.class,
			spisok_tovarov_vremenno.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<spisok_tovarov_vremenno> spisok_tovarov_vremennos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (spisok_tovarov_vremenno spisok_tovarov_vremenno : spisok_tovarov_vremennos) {
			entityCache.removeResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
				spisok_tovarov_vremennoImpl.class,
				spisok_tovarov_vremenno.getPrimaryKey());
		}
	}

	/**
	 * Creates a new spisok_tovarov_vremenno with the primary key. Does not add the spisok_tovarov_vremenno to the database.
	 *
	 * @param spisok_tovarov_vremenno_id the primary key for the new spisok_tovarov_vremenno
	 * @return the new spisok_tovarov_vremenno
	 */
	@Override
	public spisok_tovarov_vremenno create(long spisok_tovarov_vremenno_id) {
		spisok_tovarov_vremenno spisok_tovarov_vremenno = new spisok_tovarov_vremennoImpl();

		spisok_tovarov_vremenno.setNew(true);
		spisok_tovarov_vremenno.setPrimaryKey(spisok_tovarov_vremenno_id);

		return spisok_tovarov_vremenno;
	}

	/**
	 * Removes the spisok_tovarov_vremenno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno that was removed
	 * @throws NoSuchspisok_tovarov_vremennoException if a spisok_tovarov_vremenno with the primary key could not be found
	 */
	@Override
	public spisok_tovarov_vremenno remove(long spisok_tovarov_vremenno_id)
		throws NoSuchspisok_tovarov_vremennoException {
		return remove((Serializable)spisok_tovarov_vremenno_id);
	}

	/**
	 * Removes the spisok_tovarov_vremenno with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno that was removed
	 * @throws NoSuchspisok_tovarov_vremennoException if a spisok_tovarov_vremenno with the primary key could not be found
	 */
	@Override
	public spisok_tovarov_vremenno remove(Serializable primaryKey)
		throws NoSuchspisok_tovarov_vremennoException {
		Session session = null;

		try {
			session = openSession();

			spisok_tovarov_vremenno spisok_tovarov_vremenno = (spisok_tovarov_vremenno)session.get(spisok_tovarov_vremennoImpl.class,
					primaryKey);

			if (spisok_tovarov_vremenno == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchspisok_tovarov_vremennoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(spisok_tovarov_vremenno);
		}
		catch (NoSuchspisok_tovarov_vremennoException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected spisok_tovarov_vremenno removeImpl(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		spisok_tovarov_vremenno = toUnwrappedModel(spisok_tovarov_vremenno);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(spisok_tovarov_vremenno)) {
				spisok_tovarov_vremenno = (spisok_tovarov_vremenno)session.get(spisok_tovarov_vremennoImpl.class,
						spisok_tovarov_vremenno.getPrimaryKeyObj());
			}

			if (spisok_tovarov_vremenno != null) {
				session.delete(spisok_tovarov_vremenno);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (spisok_tovarov_vremenno != null) {
			clearCache(spisok_tovarov_vremenno);
		}

		return spisok_tovarov_vremenno;
	}

	@Override
	public spisok_tovarov_vremenno updateImpl(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		spisok_tovarov_vremenno = toUnwrappedModel(spisok_tovarov_vremenno);

		boolean isNew = spisok_tovarov_vremenno.isNew();

		Session session = null;

		try {
			session = openSession();

			if (spisok_tovarov_vremenno.isNew()) {
				session.save(spisok_tovarov_vremenno);

				spisok_tovarov_vremenno.setNew(false);
			}
			else {
				spisok_tovarov_vremenno = (spisok_tovarov_vremenno)session.merge(spisok_tovarov_vremenno);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
			spisok_tovarov_vremennoImpl.class,
			spisok_tovarov_vremenno.getPrimaryKey(), spisok_tovarov_vremenno,
			false);

		spisok_tovarov_vremenno.resetOriginalValues();

		return spisok_tovarov_vremenno;
	}

	protected spisok_tovarov_vremenno toUnwrappedModel(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		if (spisok_tovarov_vremenno instanceof spisok_tovarov_vremennoImpl) {
			return spisok_tovarov_vremenno;
		}

		spisok_tovarov_vremennoImpl spisok_tovarov_vremennoImpl = new spisok_tovarov_vremennoImpl();

		spisok_tovarov_vremennoImpl.setNew(spisok_tovarov_vremenno.isNew());
		spisok_tovarov_vremennoImpl.setPrimaryKey(spisok_tovarov_vremenno.getPrimaryKey());

		spisok_tovarov_vremennoImpl.setData_sozdanija(spisok_tovarov_vremenno.getData_sozdanija());
		spisok_tovarov_vremennoImpl.setEdinica_izmerenija_id(spisok_tovarov_vremenno.getEdinica_izmerenija_id());
		spisok_tovarov_vremennoImpl.setIzvewenie_id(spisok_tovarov_vremenno.getIzvewenie_id());
		spisok_tovarov_vremennoImpl.setKlassifikacija_po_okdp(spisok_tovarov_vremenno.getKlassifikacija_po_okdp());
		spisok_tovarov_vremennoImpl.setKod_po_okdp(spisok_tovarov_vremenno.getKod_po_okdp());
		spisok_tovarov_vremennoImpl.setKod_po_spravochniku_naimenovanij(spisok_tovarov_vremenno.getKod_po_spravochniku_naimenovanij());
		spisok_tovarov_vremennoImpl.setKod_strany_proizvoditelja(spisok_tovarov_vremenno.getKod_strany_proizvoditelja());
		spisok_tovarov_vremennoImpl.setKolichestvo(spisok_tovarov_vremenno.getKolichestvo());
		spisok_tovarov_vremennoImpl.setNaimenovanie_tovara(spisok_tovarov_vremenno.getNaimenovanie_tovara());
		spisok_tovarov_vremennoImpl.setNomer_lota(spisok_tovarov_vremenno.getNomer_lota());
		spisok_tovarov_vremennoImpl.setOpisanie_tovara(spisok_tovarov_vremenno.getOpisanie_tovara());
		spisok_tovarov_vremennoImpl.setSozdal(spisok_tovarov_vremenno.getSozdal());
		spisok_tovarov_vremennoImpl.setSpisok_tovarov_vremenno_id(spisok_tovarov_vremenno.getSpisok_tovarov_vremenno_id());

		return spisok_tovarov_vremennoImpl;
	}

	/**
	 * Returns the spisok_tovarov_vremenno with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno
	 * @throws NoSuchspisok_tovarov_vremennoException if a spisok_tovarov_vremenno with the primary key could not be found
	 */
	@Override
	public spisok_tovarov_vremenno findByPrimaryKey(Serializable primaryKey)
		throws NoSuchspisok_tovarov_vremennoException {
		spisok_tovarov_vremenno spisok_tovarov_vremenno = fetchByPrimaryKey(primaryKey);

		if (spisok_tovarov_vremenno == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchspisok_tovarov_vremennoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return spisok_tovarov_vremenno;
	}

	/**
	 * Returns the spisok_tovarov_vremenno with the primary key or throws a {@link NoSuchspisok_tovarov_vremennoException} if it could not be found.
	 *
	 * @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno
	 * @throws NoSuchspisok_tovarov_vremennoException if a spisok_tovarov_vremenno with the primary key could not be found
	 */
	@Override
	public spisok_tovarov_vremenno findByPrimaryKey(
		long spisok_tovarov_vremenno_id)
		throws NoSuchspisok_tovarov_vremennoException {
		return findByPrimaryKey((Serializable)spisok_tovarov_vremenno_id);
	}

	/**
	 * Returns the spisok_tovarov_vremenno with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno, or <code>null</code> if a spisok_tovarov_vremenno with the primary key could not be found
	 */
	@Override
	public spisok_tovarov_vremenno fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
				spisok_tovarov_vremennoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		spisok_tovarov_vremenno spisok_tovarov_vremenno = (spisok_tovarov_vremenno)serializable;

		if (spisok_tovarov_vremenno == null) {
			Session session = null;

			try {
				session = openSession();

				spisok_tovarov_vremenno = (spisok_tovarov_vremenno)session.get(spisok_tovarov_vremennoImpl.class,
						primaryKey);

				if (spisok_tovarov_vremenno != null) {
					cacheResult(spisok_tovarov_vremenno);
				}
				else {
					entityCache.putResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
						spisok_tovarov_vremennoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
					spisok_tovarov_vremennoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return spisok_tovarov_vremenno;
	}

	/**
	 * Returns the spisok_tovarov_vremenno with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	 * @return the spisok_tovarov_vremenno, or <code>null</code> if a spisok_tovarov_vremenno with the primary key could not be found
	 */
	@Override
	public spisok_tovarov_vremenno fetchByPrimaryKey(
		long spisok_tovarov_vremenno_id) {
		return fetchByPrimaryKey((Serializable)spisok_tovarov_vremenno_id);
	}

	@Override
	public Map<Serializable, spisok_tovarov_vremenno> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, spisok_tovarov_vremenno> map = new HashMap<Serializable, spisok_tovarov_vremenno>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			spisok_tovarov_vremenno spisok_tovarov_vremenno = fetchByPrimaryKey(primaryKey);

			if (spisok_tovarov_vremenno != null) {
				map.put(primaryKey, spisok_tovarov_vremenno);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
					spisok_tovarov_vremennoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (spisok_tovarov_vremenno)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SPISOK_TOVAROV_VREMENNO_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (spisok_tovarov_vremenno spisok_tovarov_vremenno : (List<spisok_tovarov_vremenno>)q.list()) {
				map.put(spisok_tovarov_vremenno.getPrimaryKeyObj(),
					spisok_tovarov_vremenno);

				cacheResult(spisok_tovarov_vremenno);

				uncachedPrimaryKeys.remove(spisok_tovarov_vremenno.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(spisok_tovarov_vremennoModelImpl.ENTITY_CACHE_ENABLED,
					spisok_tovarov_vremennoImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the spisok_tovarov_vremennos.
	 *
	 * @return the spisok_tovarov_vremennos
	 */
	@Override
	public List<spisok_tovarov_vremenno> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the spisok_tovarov_vremennos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_tovarov_vremennos
	 * @param end the upper bound of the range of spisok_tovarov_vremennos (not inclusive)
	 * @return the range of spisok_tovarov_vremennos
	 */
	@Override
	public List<spisok_tovarov_vremenno> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the spisok_tovarov_vremennos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_tovarov_vremennos
	 * @param end the upper bound of the range of spisok_tovarov_vremennos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of spisok_tovarov_vremennos
	 */
	@Override
	public List<spisok_tovarov_vremenno> findAll(int start, int end,
		OrderByComparator<spisok_tovarov_vremenno> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the spisok_tovarov_vremennos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of spisok_tovarov_vremennos
	 * @param end the upper bound of the range of spisok_tovarov_vremennos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of spisok_tovarov_vremennos
	 */
	@Override
	public List<spisok_tovarov_vremenno> findAll(int start, int end,
		OrderByComparator<spisok_tovarov_vremenno> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<spisok_tovarov_vremenno> list = null;

		if (retrieveFromCache) {
			list = (List<spisok_tovarov_vremenno>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SPISOK_TOVAROV_VREMENNO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SPISOK_TOVAROV_VREMENNO;

				if (pagination) {
					sql = sql.concat(spisok_tovarov_vremennoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<spisok_tovarov_vremenno>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<spisok_tovarov_vremenno>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the spisok_tovarov_vremennos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (spisok_tovarov_vremenno spisok_tovarov_vremenno : findAll()) {
			remove(spisok_tovarov_vremenno);
		}
	}

	/**
	 * Returns the number of spisok_tovarov_vremennos.
	 *
	 * @return the number of spisok_tovarov_vremennos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SPISOK_TOVAROV_VREMENNO);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return spisok_tovarov_vremennoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the spisok_tovarov_vremenno persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(spisok_tovarov_vremennoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SPISOK_TOVAROV_VREMENNO = "SELECT spisok_tovarov_vremenno FROM spisok_tovarov_vremenno spisok_tovarov_vremenno";
	private static final String _SQL_SELECT_SPISOK_TOVAROV_VREMENNO_WHERE_PKS_IN =
		"SELECT spisok_tovarov_vremenno FROM spisok_tovarov_vremenno spisok_tovarov_vremenno WHERE spisok_tovarov_vremenno_id IN (";
	private static final String _SQL_COUNT_SPISOK_TOVAROV_VREMENNO = "SELECT COUNT(spisok_tovarov_vremenno) FROM spisok_tovarov_vremenno spisok_tovarov_vremenno";
	private static final String _ORDER_BY_ENTITY_ALIAS = "spisok_tovarov_vremenno.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No spisok_tovarov_vremenno exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(spisok_tovarov_vremennoPersistenceImpl.class);
}