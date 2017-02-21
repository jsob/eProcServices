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

package tj.ne.sostojavshiesja.zakazy.service.persistence.impl;

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

import tj.ne.sostojavshiesja.zakazy.exception.NoSuchne_sostojavshiesja_zakazyException;
import tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyImpl;
import tj.ne.sostojavshiesja.zakazy.model.impl.ne_sostojavshiesja_zakazyModelImpl;
import tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy;
import tj.ne.sostojavshiesja.zakazy.service.persistence.ne_sostojavshiesja_zakazyPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the ne_sostojavshiesja_zakazy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ne_sostojavshiesja_zakazyPersistence
 * @see tj.ne.sostojavshiesja.zakazy.service.persistence.ne_sostojavshiesja_zakazyUtil
 * @generated
 */
@ProviderType
public class ne_sostojavshiesja_zakazyPersistenceImpl
	extends BasePersistenceImpl<ne_sostojavshiesja_zakazy>
	implements ne_sostojavshiesja_zakazyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ne_sostojavshiesja_zakazyUtil} to access the ne_sostojavshiesja_zakazy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ne_sostojavshiesja_zakazyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			ne_sostojavshiesja_zakazyModelImpl.FINDER_CACHE_ENABLED,
			ne_sostojavshiesja_zakazyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			ne_sostojavshiesja_zakazyModelImpl.FINDER_CACHE_ENABLED,
			ne_sostojavshiesja_zakazyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			ne_sostojavshiesja_zakazyModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public ne_sostojavshiesja_zakazyPersistenceImpl() {
		setModelClass(ne_sostojavshiesja_zakazy.class);
	}

	/**
	 * Caches the ne_sostojavshiesja_zakazy in the entity cache if it is enabled.
	 *
	 * @param ne_sostojavshiesja_zakazy the ne_sostojavshiesja_zakazy
	 */
	@Override
	public void cacheResult(ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy) {
		entityCache.putResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			ne_sostojavshiesja_zakazyImpl.class,
			ne_sostojavshiesja_zakazy.getPrimaryKey(), ne_sostojavshiesja_zakazy);

		ne_sostojavshiesja_zakazy.resetOriginalValues();
	}

	/**
	 * Caches the ne_sostojavshiesja_zakazies in the entity cache if it is enabled.
	 *
	 * @param ne_sostojavshiesja_zakazies the ne_sostojavshiesja_zakazies
	 */
	@Override
	public void cacheResult(
		List<ne_sostojavshiesja_zakazy> ne_sostojavshiesja_zakazies) {
		for (ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy : ne_sostojavshiesja_zakazies) {
			if (entityCache.getResult(
						ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
						ne_sostojavshiesja_zakazyImpl.class,
						ne_sostojavshiesja_zakazy.getPrimaryKey()) == null) {
				cacheResult(ne_sostojavshiesja_zakazy);
			}
			else {
				ne_sostojavshiesja_zakazy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ne_sostojavshiesja_zakazies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ne_sostojavshiesja_zakazyImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ne_sostojavshiesja_zakazy.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy) {
		entityCache.removeResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			ne_sostojavshiesja_zakazyImpl.class,
			ne_sostojavshiesja_zakazy.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<ne_sostojavshiesja_zakazy> ne_sostojavshiesja_zakazies) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy : ne_sostojavshiesja_zakazies) {
			entityCache.removeResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
				ne_sostojavshiesja_zakazyImpl.class,
				ne_sostojavshiesja_zakazy.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ne_sostojavshiesja_zakazy with the primary key. Does not add the ne_sostojavshiesja_zakazy to the database.
	 *
	 * @param ne_sostojavshiesja_zakazy_id the primary key for the new ne_sostojavshiesja_zakazy
	 * @return the new ne_sostojavshiesja_zakazy
	 */
	@Override
	public ne_sostojavshiesja_zakazy create(long ne_sostojavshiesja_zakazy_id) {
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy = new ne_sostojavshiesja_zakazyImpl();

		ne_sostojavshiesja_zakazy.setNew(true);
		ne_sostojavshiesja_zakazy.setPrimaryKey(ne_sostojavshiesja_zakazy_id);

		return ne_sostojavshiesja_zakazy;
	}

	/**
	 * Removes the ne_sostojavshiesja_zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ne_sostojavshiesja_zakazy_id the primary key of the ne_sostojavshiesja_zakazy
	 * @return the ne_sostojavshiesja_zakazy that was removed
	 * @throws NoSuchne_sostojavshiesja_zakazyException if a ne_sostojavshiesja_zakazy with the primary key could not be found
	 */
	@Override
	public ne_sostojavshiesja_zakazy remove(long ne_sostojavshiesja_zakazy_id)
		throws NoSuchne_sostojavshiesja_zakazyException {
		return remove((Serializable)ne_sostojavshiesja_zakazy_id);
	}

	/**
	 * Removes the ne_sostojavshiesja_zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ne_sostojavshiesja_zakazy
	 * @return the ne_sostojavshiesja_zakazy that was removed
	 * @throws NoSuchne_sostojavshiesja_zakazyException if a ne_sostojavshiesja_zakazy with the primary key could not be found
	 */
	@Override
	public ne_sostojavshiesja_zakazy remove(Serializable primaryKey)
		throws NoSuchne_sostojavshiesja_zakazyException {
		Session session = null;

		try {
			session = openSession();

			ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy = (ne_sostojavshiesja_zakazy)session.get(ne_sostojavshiesja_zakazyImpl.class,
					primaryKey);

			if (ne_sostojavshiesja_zakazy == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchne_sostojavshiesja_zakazyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ne_sostojavshiesja_zakazy);
		}
		catch (NoSuchne_sostojavshiesja_zakazyException nsee) {
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
	protected ne_sostojavshiesja_zakazy removeImpl(
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy) {
		ne_sostojavshiesja_zakazy = toUnwrappedModel(ne_sostojavshiesja_zakazy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ne_sostojavshiesja_zakazy)) {
				ne_sostojavshiesja_zakazy = (ne_sostojavshiesja_zakazy)session.get(ne_sostojavshiesja_zakazyImpl.class,
						ne_sostojavshiesja_zakazy.getPrimaryKeyObj());
			}

			if (ne_sostojavshiesja_zakazy != null) {
				session.delete(ne_sostojavshiesja_zakazy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ne_sostojavshiesja_zakazy != null) {
			clearCache(ne_sostojavshiesja_zakazy);
		}

		return ne_sostojavshiesja_zakazy;
	}

	@Override
	public ne_sostojavshiesja_zakazy updateImpl(
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy) {
		ne_sostojavshiesja_zakazy = toUnwrappedModel(ne_sostojavshiesja_zakazy);

		boolean isNew = ne_sostojavshiesja_zakazy.isNew();

		Session session = null;

		try {
			session = openSession();

			if (ne_sostojavshiesja_zakazy.isNew()) {
				session.save(ne_sostojavshiesja_zakazy);

				ne_sostojavshiesja_zakazy.setNew(false);
			}
			else {
				ne_sostojavshiesja_zakazy = (ne_sostojavshiesja_zakazy)session.merge(ne_sostojavshiesja_zakazy);
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

		entityCache.putResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
			ne_sostojavshiesja_zakazyImpl.class,
			ne_sostojavshiesja_zakazy.getPrimaryKey(),
			ne_sostojavshiesja_zakazy, false);

		ne_sostojavshiesja_zakazy.resetOriginalValues();

		return ne_sostojavshiesja_zakazy;
	}

	protected ne_sostojavshiesja_zakazy toUnwrappedModel(
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy) {
		if (ne_sostojavshiesja_zakazy instanceof ne_sostojavshiesja_zakazyImpl) {
			return ne_sostojavshiesja_zakazy;
		}

		ne_sostojavshiesja_zakazyImpl ne_sostojavshiesja_zakazyImpl = new ne_sostojavshiesja_zakazyImpl();

		ne_sostojavshiesja_zakazyImpl.setNew(ne_sostojavshiesja_zakazy.isNew());
		ne_sostojavshiesja_zakazyImpl.setPrimaryKey(ne_sostojavshiesja_zakazy.getPrimaryKey());

		ne_sostojavshiesja_zakazyImpl.setData_sozdanija(ne_sostojavshiesja_zakazy.getData_sozdanija());
		ne_sostojavshiesja_zakazyImpl.setIzvewenie_id(ne_sostojavshiesja_zakazy.getIzvewenie_id());
		ne_sostojavshiesja_zakazyImpl.setNe_sostojavshiesja_zakazy_id(ne_sostojavshiesja_zakazy.getNe_sostojavshiesja_zakazy_id());
		ne_sostojavshiesja_zakazyImpl.setPrichina(ne_sostojavshiesja_zakazy.getPrichina());
		ne_sostojavshiesja_zakazyImpl.setSozdal(ne_sostojavshiesja_zakazy.getSozdal());

		return ne_sostojavshiesja_zakazyImpl;
	}

	/**
	 * Returns the ne_sostojavshiesja_zakazy with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ne_sostojavshiesja_zakazy
	 * @return the ne_sostojavshiesja_zakazy
	 * @throws NoSuchne_sostojavshiesja_zakazyException if a ne_sostojavshiesja_zakazy with the primary key could not be found
	 */
	@Override
	public ne_sostojavshiesja_zakazy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchne_sostojavshiesja_zakazyException {
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy = fetchByPrimaryKey(primaryKey);

		if (ne_sostojavshiesja_zakazy == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchne_sostojavshiesja_zakazyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ne_sostojavshiesja_zakazy;
	}

	/**
	 * Returns the ne_sostojavshiesja_zakazy with the primary key or throws a {@link NoSuchne_sostojavshiesja_zakazyException} if it could not be found.
	 *
	 * @param ne_sostojavshiesja_zakazy_id the primary key of the ne_sostojavshiesja_zakazy
	 * @return the ne_sostojavshiesja_zakazy
	 * @throws NoSuchne_sostojavshiesja_zakazyException if a ne_sostojavshiesja_zakazy with the primary key could not be found
	 */
	@Override
	public ne_sostojavshiesja_zakazy findByPrimaryKey(
		long ne_sostojavshiesja_zakazy_id)
		throws NoSuchne_sostojavshiesja_zakazyException {
		return findByPrimaryKey((Serializable)ne_sostojavshiesja_zakazy_id);
	}

	/**
	 * Returns the ne_sostojavshiesja_zakazy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ne_sostojavshiesja_zakazy
	 * @return the ne_sostojavshiesja_zakazy, or <code>null</code> if a ne_sostojavshiesja_zakazy with the primary key could not be found
	 */
	@Override
	public ne_sostojavshiesja_zakazy fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
				ne_sostojavshiesja_zakazyImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy = (ne_sostojavshiesja_zakazy)serializable;

		if (ne_sostojavshiesja_zakazy == null) {
			Session session = null;

			try {
				session = openSession();

				ne_sostojavshiesja_zakazy = (ne_sostojavshiesja_zakazy)session.get(ne_sostojavshiesja_zakazyImpl.class,
						primaryKey);

				if (ne_sostojavshiesja_zakazy != null) {
					cacheResult(ne_sostojavshiesja_zakazy);
				}
				else {
					entityCache.putResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
						ne_sostojavshiesja_zakazyImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
					ne_sostojavshiesja_zakazyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ne_sostojavshiesja_zakazy;
	}

	/**
	 * Returns the ne_sostojavshiesja_zakazy with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ne_sostojavshiesja_zakazy_id the primary key of the ne_sostojavshiesja_zakazy
	 * @return the ne_sostojavshiesja_zakazy, or <code>null</code> if a ne_sostojavshiesja_zakazy with the primary key could not be found
	 */
	@Override
	public ne_sostojavshiesja_zakazy fetchByPrimaryKey(
		long ne_sostojavshiesja_zakazy_id) {
		return fetchByPrimaryKey((Serializable)ne_sostojavshiesja_zakazy_id);
	}

	@Override
	public Map<Serializable, ne_sostojavshiesja_zakazy> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ne_sostojavshiesja_zakazy> map = new HashMap<Serializable, ne_sostojavshiesja_zakazy>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy = fetchByPrimaryKey(primaryKey);

			if (ne_sostojavshiesja_zakazy != null) {
				map.put(primaryKey, ne_sostojavshiesja_zakazy);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
					ne_sostojavshiesja_zakazyImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ne_sostojavshiesja_zakazy)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_NE_SOSTOJAVSHIESJA_ZAKAZY_WHERE_PKS_IN);

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

			for (ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy : (List<ne_sostojavshiesja_zakazy>)q.list()) {
				map.put(ne_sostojavshiesja_zakazy.getPrimaryKeyObj(),
					ne_sostojavshiesja_zakazy);

				cacheResult(ne_sostojavshiesja_zakazy);

				uncachedPrimaryKeys.remove(ne_sostojavshiesja_zakazy.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ne_sostojavshiesja_zakazyModelImpl.ENTITY_CACHE_ENABLED,
					ne_sostojavshiesja_zakazyImpl.class, primaryKey, nullModel);
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
	 * Returns all the ne_sostojavshiesja_zakazies.
	 *
	 * @return the ne_sostojavshiesja_zakazies
	 */
	@Override
	public List<ne_sostojavshiesja_zakazy> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ne_sostojavshiesja_zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ne_sostojavshiesja_zakazies
	 * @param end the upper bound of the range of ne_sostojavshiesja_zakazies (not inclusive)
	 * @return the range of ne_sostojavshiesja_zakazies
	 */
	@Override
	public List<ne_sostojavshiesja_zakazy> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ne_sostojavshiesja_zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ne_sostojavshiesja_zakazies
	 * @param end the upper bound of the range of ne_sostojavshiesja_zakazies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ne_sostojavshiesja_zakazies
	 */
	@Override
	public List<ne_sostojavshiesja_zakazy> findAll(int start, int end,
		OrderByComparator<ne_sostojavshiesja_zakazy> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ne_sostojavshiesja_zakazies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ne_sostojavshiesja_zakazies
	 * @param end the upper bound of the range of ne_sostojavshiesja_zakazies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ne_sostojavshiesja_zakazies
	 */
	@Override
	public List<ne_sostojavshiesja_zakazy> findAll(int start, int end,
		OrderByComparator<ne_sostojavshiesja_zakazy> orderByComparator,
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

		List<ne_sostojavshiesja_zakazy> list = null;

		if (retrieveFromCache) {
			list = (List<ne_sostojavshiesja_zakazy>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_NE_SOSTOJAVSHIESJA_ZAKAZY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NE_SOSTOJAVSHIESJA_ZAKAZY;

				if (pagination) {
					sql = sql.concat(ne_sostojavshiesja_zakazyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ne_sostojavshiesja_zakazy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ne_sostojavshiesja_zakazy>)QueryUtil.list(q,
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
	 * Removes all the ne_sostojavshiesja_zakazies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy : findAll()) {
			remove(ne_sostojavshiesja_zakazy);
		}
	}

	/**
	 * Returns the number of ne_sostojavshiesja_zakazies.
	 *
	 * @return the number of ne_sostojavshiesja_zakazies
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NE_SOSTOJAVSHIESJA_ZAKAZY);

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
		return ne_sostojavshiesja_zakazyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ne_sostojavshiesja_zakazy persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ne_sostojavshiesja_zakazyImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_NE_SOSTOJAVSHIESJA_ZAKAZY = "SELECT ne_sostojavshiesja_zakazy FROM ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy";
	private static final String _SQL_SELECT_NE_SOSTOJAVSHIESJA_ZAKAZY_WHERE_PKS_IN =
		"SELECT ne_sostojavshiesja_zakazy FROM ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy WHERE ne_sostojavshiesja_zakazy_id IN (";
	private static final String _SQL_COUNT_NE_SOSTOJAVSHIESJA_ZAKAZY = "SELECT COUNT(ne_sostojavshiesja_zakazy) FROM ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ne_sostojavshiesja_zakazy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ne_sostojavshiesja_zakazy exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ne_sostojavshiesja_zakazyPersistenceImpl.class);
}