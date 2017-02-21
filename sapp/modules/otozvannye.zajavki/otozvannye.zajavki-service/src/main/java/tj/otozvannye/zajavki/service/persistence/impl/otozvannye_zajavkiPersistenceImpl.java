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

package tj.otozvannye.zajavki.service.persistence.impl;

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

import tj.otozvannye.zajavki.exception.NoSuchotozvannye_zajavkiException;
import tj.otozvannye.zajavki.model.impl.otozvannye_zajavkiImpl;
import tj.otozvannye.zajavki.model.impl.otozvannye_zajavkiModelImpl;
import tj.otozvannye.zajavki.model.otozvannye_zajavki;
import tj.otozvannye.zajavki.service.persistence.otozvannye_zajavkiPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the otozvannye_zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see otozvannye_zajavkiPersistence
 * @see tj.otozvannye.zajavki.service.persistence.otozvannye_zajavkiUtil
 * @generated
 */
@ProviderType
public class otozvannye_zajavkiPersistenceImpl extends BasePersistenceImpl<otozvannye_zajavki>
	implements otozvannye_zajavkiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link otozvannye_zajavkiUtil} to access the otozvannye_zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = otozvannye_zajavkiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otozvannye_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			otozvannye_zajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otozvannye_zajavkiModelImpl.FINDER_CACHE_ENABLED,
			otozvannye_zajavkiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otozvannye_zajavkiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public otozvannye_zajavkiPersistenceImpl() {
		setModelClass(otozvannye_zajavki.class);
	}

	/**
	 * Caches the otozvannye_zajavki in the entity cache if it is enabled.
	 *
	 * @param otozvannye_zajavki the otozvannye_zajavki
	 */
	@Override
	public void cacheResult(otozvannye_zajavki otozvannye_zajavki) {
		entityCache.putResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otozvannye_zajavkiImpl.class, otozvannye_zajavki.getPrimaryKey(),
			otozvannye_zajavki);

		otozvannye_zajavki.resetOriginalValues();
	}

	/**
	 * Caches the otozvannye_zajavkis in the entity cache if it is enabled.
	 *
	 * @param otozvannye_zajavkis the otozvannye_zajavkis
	 */
	@Override
	public void cacheResult(List<otozvannye_zajavki> otozvannye_zajavkis) {
		for (otozvannye_zajavki otozvannye_zajavki : otozvannye_zajavkis) {
			if (entityCache.getResult(
						otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
						otozvannye_zajavkiImpl.class,
						otozvannye_zajavki.getPrimaryKey()) == null) {
				cacheResult(otozvannye_zajavki);
			}
			else {
				otozvannye_zajavki.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all otozvannye_zajavkis.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(otozvannye_zajavkiImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the otozvannye_zajavki.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(otozvannye_zajavki otozvannye_zajavki) {
		entityCache.removeResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otozvannye_zajavkiImpl.class, otozvannye_zajavki.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<otozvannye_zajavki> otozvannye_zajavkis) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (otozvannye_zajavki otozvannye_zajavki : otozvannye_zajavkis) {
			entityCache.removeResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
				otozvannye_zajavkiImpl.class, otozvannye_zajavki.getPrimaryKey());
		}
	}

	/**
	 * Creates a new otozvannye_zajavki with the primary key. Does not add the otozvannye_zajavki to the database.
	 *
	 * @param otozvannye_zajavki_id the primary key for the new otozvannye_zajavki
	 * @return the new otozvannye_zajavki
	 */
	@Override
	public otozvannye_zajavki create(long otozvannye_zajavki_id) {
		otozvannye_zajavki otozvannye_zajavki = new otozvannye_zajavkiImpl();

		otozvannye_zajavki.setNew(true);
		otozvannye_zajavki.setPrimaryKey(otozvannye_zajavki_id);

		return otozvannye_zajavki;
	}

	/**
	 * Removes the otozvannye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	 * @return the otozvannye_zajavki that was removed
	 * @throws NoSuchotozvannye_zajavkiException if a otozvannye_zajavki with the primary key could not be found
	 */
	@Override
	public otozvannye_zajavki remove(long otozvannye_zajavki_id)
		throws NoSuchotozvannye_zajavkiException {
		return remove((Serializable)otozvannye_zajavki_id);
	}

	/**
	 * Removes the otozvannye_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the otozvannye_zajavki
	 * @return the otozvannye_zajavki that was removed
	 * @throws NoSuchotozvannye_zajavkiException if a otozvannye_zajavki with the primary key could not be found
	 */
	@Override
	public otozvannye_zajavki remove(Serializable primaryKey)
		throws NoSuchotozvannye_zajavkiException {
		Session session = null;

		try {
			session = openSession();

			otozvannye_zajavki otozvannye_zajavki = (otozvannye_zajavki)session.get(otozvannye_zajavkiImpl.class,
					primaryKey);

			if (otozvannye_zajavki == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchotozvannye_zajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(otozvannye_zajavki);
		}
		catch (NoSuchotozvannye_zajavkiException nsee) {
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
	protected otozvannye_zajavki removeImpl(
		otozvannye_zajavki otozvannye_zajavki) {
		otozvannye_zajavki = toUnwrappedModel(otozvannye_zajavki);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(otozvannye_zajavki)) {
				otozvannye_zajavki = (otozvannye_zajavki)session.get(otozvannye_zajavkiImpl.class,
						otozvannye_zajavki.getPrimaryKeyObj());
			}

			if (otozvannye_zajavki != null) {
				session.delete(otozvannye_zajavki);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (otozvannye_zajavki != null) {
			clearCache(otozvannye_zajavki);
		}

		return otozvannye_zajavki;
	}

	@Override
	public otozvannye_zajavki updateImpl(otozvannye_zajavki otozvannye_zajavki) {
		otozvannye_zajavki = toUnwrappedModel(otozvannye_zajavki);

		boolean isNew = otozvannye_zajavki.isNew();

		Session session = null;

		try {
			session = openSession();

			if (otozvannye_zajavki.isNew()) {
				session.save(otozvannye_zajavki);

				otozvannye_zajavki.setNew(false);
			}
			else {
				otozvannye_zajavki = (otozvannye_zajavki)session.merge(otozvannye_zajavki);
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

		entityCache.putResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
			otozvannye_zajavkiImpl.class, otozvannye_zajavki.getPrimaryKey(),
			otozvannye_zajavki, false);

		otozvannye_zajavki.resetOriginalValues();

		return otozvannye_zajavki;
	}

	protected otozvannye_zajavki toUnwrappedModel(
		otozvannye_zajavki otozvannye_zajavki) {
		if (otozvannye_zajavki instanceof otozvannye_zajavkiImpl) {
			return otozvannye_zajavki;
		}

		otozvannye_zajavkiImpl otozvannye_zajavkiImpl = new otozvannye_zajavkiImpl();

		otozvannye_zajavkiImpl.setNew(otozvannye_zajavki.isNew());
		otozvannye_zajavkiImpl.setPrimaryKey(otozvannye_zajavki.getPrimaryKey());

		otozvannye_zajavkiImpl.setData_otzyva(otozvannye_zajavki.getData_otzyva());
		otozvannye_zajavkiImpl.setItogo_za_tovar(otozvannye_zajavki.getItogo_za_tovar());
		otozvannye_zajavkiImpl.setIzvewenie_id(otozvannye_zajavki.getIzvewenie_id());
		otozvannye_zajavkiImpl.setKolichestvo(otozvannye_zajavki.getKolichestvo());
		otozvannye_zajavkiImpl.setLot_id(otozvannye_zajavki.getLot_id());
		otozvannye_zajavkiImpl.setOtozval(otozvannye_zajavki.getOtozval());
		otozvannye_zajavkiImpl.setOtozvannye_zajavki_id(otozvannye_zajavki.getOtozvannye_zajavki_id());
		otozvannye_zajavkiImpl.setPostavwik_id(otozvannye_zajavki.getPostavwik_id());
		otozvannye_zajavkiImpl.setSumma_za_edinicu_tovara(otozvannye_zajavki.getSumma_za_edinicu_tovara());
		otozvannye_zajavkiImpl.setTovar_id(otozvannye_zajavki.getTovar_id());

		return otozvannye_zajavkiImpl;
	}

	/**
	 * Returns the otozvannye_zajavki with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the otozvannye_zajavki
	 * @return the otozvannye_zajavki
	 * @throws NoSuchotozvannye_zajavkiException if a otozvannye_zajavki with the primary key could not be found
	 */
	@Override
	public otozvannye_zajavki findByPrimaryKey(Serializable primaryKey)
		throws NoSuchotozvannye_zajavkiException {
		otozvannye_zajavki otozvannye_zajavki = fetchByPrimaryKey(primaryKey);

		if (otozvannye_zajavki == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchotozvannye_zajavkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return otozvannye_zajavki;
	}

	/**
	 * Returns the otozvannye_zajavki with the primary key or throws a {@link NoSuchotozvannye_zajavkiException} if it could not be found.
	 *
	 * @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	 * @return the otozvannye_zajavki
	 * @throws NoSuchotozvannye_zajavkiException if a otozvannye_zajavki with the primary key could not be found
	 */
	@Override
	public otozvannye_zajavki findByPrimaryKey(long otozvannye_zajavki_id)
		throws NoSuchotozvannye_zajavkiException {
		return findByPrimaryKey((Serializable)otozvannye_zajavki_id);
	}

	/**
	 * Returns the otozvannye_zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the otozvannye_zajavki
	 * @return the otozvannye_zajavki, or <code>null</code> if a otozvannye_zajavki with the primary key could not be found
	 */
	@Override
	public otozvannye_zajavki fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
				otozvannye_zajavkiImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		otozvannye_zajavki otozvannye_zajavki = (otozvannye_zajavki)serializable;

		if (otozvannye_zajavki == null) {
			Session session = null;

			try {
				session = openSession();

				otozvannye_zajavki = (otozvannye_zajavki)session.get(otozvannye_zajavkiImpl.class,
						primaryKey);

				if (otozvannye_zajavki != null) {
					cacheResult(otozvannye_zajavki);
				}
				else {
					entityCache.putResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
						otozvannye_zajavkiImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					otozvannye_zajavkiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return otozvannye_zajavki;
	}

	/**
	 * Returns the otozvannye_zajavki with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param otozvannye_zajavki_id the primary key of the otozvannye_zajavki
	 * @return the otozvannye_zajavki, or <code>null</code> if a otozvannye_zajavki with the primary key could not be found
	 */
	@Override
	public otozvannye_zajavki fetchByPrimaryKey(long otozvannye_zajavki_id) {
		return fetchByPrimaryKey((Serializable)otozvannye_zajavki_id);
	}

	@Override
	public Map<Serializable, otozvannye_zajavki> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, otozvannye_zajavki> map = new HashMap<Serializable, otozvannye_zajavki>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			otozvannye_zajavki otozvannye_zajavki = fetchByPrimaryKey(primaryKey);

			if (otozvannye_zajavki != null) {
				map.put(primaryKey, otozvannye_zajavki);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					otozvannye_zajavkiImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (otozvannye_zajavki)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OTOZVANNYE_ZAJAVKI_WHERE_PKS_IN);

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

			for (otozvannye_zajavki otozvannye_zajavki : (List<otozvannye_zajavki>)q.list()) {
				map.put(otozvannye_zajavki.getPrimaryKeyObj(),
					otozvannye_zajavki);

				cacheResult(otozvannye_zajavki);

				uncachedPrimaryKeys.remove(otozvannye_zajavki.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(otozvannye_zajavkiModelImpl.ENTITY_CACHE_ENABLED,
					otozvannye_zajavkiImpl.class, primaryKey, nullModel);
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
	 * Returns all the otozvannye_zajavkis.
	 *
	 * @return the otozvannye_zajavkis
	 */
	@Override
	public List<otozvannye_zajavki> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the otozvannye_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of otozvannye_zajavkis
	 * @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	 * @return the range of otozvannye_zajavkis
	 */
	@Override
	public List<otozvannye_zajavki> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the otozvannye_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of otozvannye_zajavkis
	 * @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of otozvannye_zajavkis
	 */
	@Override
	public List<otozvannye_zajavki> findAll(int start, int end,
		OrderByComparator<otozvannye_zajavki> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the otozvannye_zajavkis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link otozvannye_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of otozvannye_zajavkis
	 * @param end the upper bound of the range of otozvannye_zajavkis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of otozvannye_zajavkis
	 */
	@Override
	public List<otozvannye_zajavki> findAll(int start, int end,
		OrderByComparator<otozvannye_zajavki> orderByComparator,
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

		List<otozvannye_zajavki> list = null;

		if (retrieveFromCache) {
			list = (List<otozvannye_zajavki>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OTOZVANNYE_ZAJAVKI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OTOZVANNYE_ZAJAVKI;

				if (pagination) {
					sql = sql.concat(otozvannye_zajavkiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<otozvannye_zajavki>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<otozvannye_zajavki>)QueryUtil.list(q,
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
	 * Removes all the otozvannye_zajavkis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (otozvannye_zajavki otozvannye_zajavki : findAll()) {
			remove(otozvannye_zajavki);
		}
	}

	/**
	 * Returns the number of otozvannye_zajavkis.
	 *
	 * @return the number of otozvannye_zajavkis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OTOZVANNYE_ZAJAVKI);

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
		return otozvannye_zajavkiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the otozvannye_zajavki persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(otozvannye_zajavkiImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OTOZVANNYE_ZAJAVKI = "SELECT otozvannye_zajavki FROM otozvannye_zajavki otozvannye_zajavki";
	private static final String _SQL_SELECT_OTOZVANNYE_ZAJAVKI_WHERE_PKS_IN = "SELECT otozvannye_zajavki FROM otozvannye_zajavki otozvannye_zajavki WHERE otozvannye_zajavki_id IN (";
	private static final String _SQL_COUNT_OTOZVANNYE_ZAJAVKI = "SELECT COUNT(otozvannye_zajavki) FROM otozvannye_zajavki otozvannye_zajavki";
	private static final String _ORDER_BY_ENTITY_ALIAS = "otozvannye_zajavki.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No otozvannye_zajavki exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(otozvannye_zajavkiPersistenceImpl.class);
}