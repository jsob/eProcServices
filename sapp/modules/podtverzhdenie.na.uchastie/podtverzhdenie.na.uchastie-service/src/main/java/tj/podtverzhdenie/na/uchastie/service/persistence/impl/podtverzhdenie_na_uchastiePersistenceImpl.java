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

package tj.podtverzhdenie.na.uchastie.service.persistence.impl;

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

import tj.podtverzhdenie.na.uchastie.exception.NoSuchpodtverzhdenie_na_uchastieException;
import tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieImpl;
import tj.podtverzhdenie.na.uchastie.model.impl.podtverzhdenie_na_uchastieModelImpl;
import tj.podtverzhdenie.na.uchastie.model.podtverzhdenie_na_uchastie;
import tj.podtverzhdenie.na.uchastie.service.persistence.podtverzhdenie_na_uchastiePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the podtverzhdenie_na_uchastie service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see podtverzhdenie_na_uchastiePersistence
 * @see tj.podtverzhdenie.na.uchastie.service.persistence.podtverzhdenie_na_uchastieUtil
 * @generated
 */
@ProviderType
public class podtverzhdenie_na_uchastiePersistenceImpl
	extends BasePersistenceImpl<podtverzhdenie_na_uchastie>
	implements podtverzhdenie_na_uchastiePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link podtverzhdenie_na_uchastieUtil} to access the podtverzhdenie_na_uchastie persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = podtverzhdenie_na_uchastieImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_na_uchastieModelImpl.FINDER_CACHE_ENABLED,
			podtverzhdenie_na_uchastieImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_na_uchastieModelImpl.FINDER_CACHE_ENABLED,
			podtverzhdenie_na_uchastieImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_na_uchastieModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public podtverzhdenie_na_uchastiePersistenceImpl() {
		setModelClass(podtverzhdenie_na_uchastie.class);
	}

	/**
	 * Caches the podtverzhdenie_na_uchastie in the entity cache if it is enabled.
	 *
	 * @param podtverzhdenie_na_uchastie the podtverzhdenie_na_uchastie
	 */
	@Override
	public void cacheResult(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		entityCache.putResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_na_uchastieImpl.class,
			podtverzhdenie_na_uchastie.getPrimaryKey(),
			podtverzhdenie_na_uchastie);

		podtverzhdenie_na_uchastie.resetOriginalValues();
	}

	/**
	 * Caches the podtverzhdenie_na_uchasties in the entity cache if it is enabled.
	 *
	 * @param podtverzhdenie_na_uchasties the podtverzhdenie_na_uchasties
	 */
	@Override
	public void cacheResult(
		List<podtverzhdenie_na_uchastie> podtverzhdenie_na_uchasties) {
		for (podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie : podtverzhdenie_na_uchasties) {
			if (entityCache.getResult(
						podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
						podtverzhdenie_na_uchastieImpl.class,
						podtverzhdenie_na_uchastie.getPrimaryKey()) == null) {
				cacheResult(podtverzhdenie_na_uchastie);
			}
			else {
				podtverzhdenie_na_uchastie.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all podtverzhdenie_na_uchasties.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(podtverzhdenie_na_uchastieImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the podtverzhdenie_na_uchastie.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		entityCache.removeResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_na_uchastieImpl.class,
			podtverzhdenie_na_uchastie.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<podtverzhdenie_na_uchastie> podtverzhdenie_na_uchasties) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie : podtverzhdenie_na_uchasties) {
			entityCache.removeResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
				podtverzhdenie_na_uchastieImpl.class,
				podtverzhdenie_na_uchastie.getPrimaryKey());
		}
	}

	/**
	 * Creates a new podtverzhdenie_na_uchastie with the primary key. Does not add the podtverzhdenie_na_uchastie to the database.
	 *
	 * @param podtverzhdenie_na_uchastie_id the primary key for the new podtverzhdenie_na_uchastie
	 * @return the new podtverzhdenie_na_uchastie
	 */
	@Override
	public podtverzhdenie_na_uchastie create(long podtverzhdenie_na_uchastie_id) {
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie = new podtverzhdenie_na_uchastieImpl();

		podtverzhdenie_na_uchastie.setNew(true);
		podtverzhdenie_na_uchastie.setPrimaryKey(podtverzhdenie_na_uchastie_id);

		return podtverzhdenie_na_uchastie;
	}

	/**
	 * Removes the podtverzhdenie_na_uchastie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie that was removed
	 * @throws NoSuchpodtverzhdenie_na_uchastieException if a podtverzhdenie_na_uchastie with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_na_uchastie remove(long podtverzhdenie_na_uchastie_id)
		throws NoSuchpodtverzhdenie_na_uchastieException {
		return remove((Serializable)podtverzhdenie_na_uchastie_id);
	}

	/**
	 * Removes the podtverzhdenie_na_uchastie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie that was removed
	 * @throws NoSuchpodtverzhdenie_na_uchastieException if a podtverzhdenie_na_uchastie with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_na_uchastie remove(Serializable primaryKey)
		throws NoSuchpodtverzhdenie_na_uchastieException {
		Session session = null;

		try {
			session = openSession();

			podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie = (podtverzhdenie_na_uchastie)session.get(podtverzhdenie_na_uchastieImpl.class,
					primaryKey);

			if (podtverzhdenie_na_uchastie == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpodtverzhdenie_na_uchastieException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(podtverzhdenie_na_uchastie);
		}
		catch (NoSuchpodtverzhdenie_na_uchastieException nsee) {
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
	protected podtverzhdenie_na_uchastie removeImpl(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		podtverzhdenie_na_uchastie = toUnwrappedModel(podtverzhdenie_na_uchastie);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(podtverzhdenie_na_uchastie)) {
				podtverzhdenie_na_uchastie = (podtverzhdenie_na_uchastie)session.get(podtverzhdenie_na_uchastieImpl.class,
						podtverzhdenie_na_uchastie.getPrimaryKeyObj());
			}

			if (podtverzhdenie_na_uchastie != null) {
				session.delete(podtverzhdenie_na_uchastie);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (podtverzhdenie_na_uchastie != null) {
			clearCache(podtverzhdenie_na_uchastie);
		}

		return podtverzhdenie_na_uchastie;
	}

	@Override
	public podtverzhdenie_na_uchastie updateImpl(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		podtverzhdenie_na_uchastie = toUnwrappedModel(podtverzhdenie_na_uchastie);

		boolean isNew = podtverzhdenie_na_uchastie.isNew();

		Session session = null;

		try {
			session = openSession();

			if (podtverzhdenie_na_uchastie.isNew()) {
				session.save(podtverzhdenie_na_uchastie);

				podtverzhdenie_na_uchastie.setNew(false);
			}
			else {
				podtverzhdenie_na_uchastie = (podtverzhdenie_na_uchastie)session.merge(podtverzhdenie_na_uchastie);
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

		entityCache.putResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
			podtverzhdenie_na_uchastieImpl.class,
			podtverzhdenie_na_uchastie.getPrimaryKey(),
			podtverzhdenie_na_uchastie, false);

		podtverzhdenie_na_uchastie.resetOriginalValues();

		return podtverzhdenie_na_uchastie;
	}

	protected podtverzhdenie_na_uchastie toUnwrappedModel(
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie) {
		if (podtverzhdenie_na_uchastie instanceof podtverzhdenie_na_uchastieImpl) {
			return podtverzhdenie_na_uchastie;
		}

		podtverzhdenie_na_uchastieImpl podtverzhdenie_na_uchastieImpl = new podtverzhdenie_na_uchastieImpl();

		podtverzhdenie_na_uchastieImpl.setNew(podtverzhdenie_na_uchastie.isNew());
		podtverzhdenie_na_uchastieImpl.setPrimaryKey(podtverzhdenie_na_uchastie.getPrimaryKey());

		podtverzhdenie_na_uchastieImpl.setData_sozdanija(podtverzhdenie_na_uchastie.getData_sozdanija());
		podtverzhdenie_na_uchastieImpl.setIzvewenie_id(podtverzhdenie_na_uchastie.getIzvewenie_id());
		podtverzhdenie_na_uchastieImpl.setLot_id(podtverzhdenie_na_uchastie.getLot_id());
		podtverzhdenie_na_uchastieImpl.setPodtverzhdenie_na_uchastie_id(podtverzhdenie_na_uchastie.getPodtverzhdenie_na_uchastie_id());
		podtverzhdenie_na_uchastieImpl.setPostavwik_id(podtverzhdenie_na_uchastie.getPostavwik_id());
		podtverzhdenie_na_uchastieImpl.setSozdal(podtverzhdenie_na_uchastie.getSozdal());

		return podtverzhdenie_na_uchastieImpl;
	}

	/**
	 * Returns the podtverzhdenie_na_uchastie with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie
	 * @throws NoSuchpodtverzhdenie_na_uchastieException if a podtverzhdenie_na_uchastie with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_na_uchastie findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpodtverzhdenie_na_uchastieException {
		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie = fetchByPrimaryKey(primaryKey);

		if (podtverzhdenie_na_uchastie == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpodtverzhdenie_na_uchastieException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return podtverzhdenie_na_uchastie;
	}

	/**
	 * Returns the podtverzhdenie_na_uchastie with the primary key or throws a {@link NoSuchpodtverzhdenie_na_uchastieException} if it could not be found.
	 *
	 * @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie
	 * @throws NoSuchpodtverzhdenie_na_uchastieException if a podtverzhdenie_na_uchastie with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_na_uchastie findByPrimaryKey(
		long podtverzhdenie_na_uchastie_id)
		throws NoSuchpodtverzhdenie_na_uchastieException {
		return findByPrimaryKey((Serializable)podtverzhdenie_na_uchastie_id);
	}

	/**
	 * Returns the podtverzhdenie_na_uchastie with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie, or <code>null</code> if a podtverzhdenie_na_uchastie with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_na_uchastie fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
				podtverzhdenie_na_uchastieImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie = (podtverzhdenie_na_uchastie)serializable;

		if (podtverzhdenie_na_uchastie == null) {
			Session session = null;

			try {
				session = openSession();

				podtverzhdenie_na_uchastie = (podtverzhdenie_na_uchastie)session.get(podtverzhdenie_na_uchastieImpl.class,
						primaryKey);

				if (podtverzhdenie_na_uchastie != null) {
					cacheResult(podtverzhdenie_na_uchastie);
				}
				else {
					entityCache.putResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
						podtverzhdenie_na_uchastieImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
					podtverzhdenie_na_uchastieImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return podtverzhdenie_na_uchastie;
	}

	/**
	 * Returns the podtverzhdenie_na_uchastie with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param podtverzhdenie_na_uchastie_id the primary key of the podtverzhdenie_na_uchastie
	 * @return the podtverzhdenie_na_uchastie, or <code>null</code> if a podtverzhdenie_na_uchastie with the primary key could not be found
	 */
	@Override
	public podtverzhdenie_na_uchastie fetchByPrimaryKey(
		long podtverzhdenie_na_uchastie_id) {
		return fetchByPrimaryKey((Serializable)podtverzhdenie_na_uchastie_id);
	}

	@Override
	public Map<Serializable, podtverzhdenie_na_uchastie> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, podtverzhdenie_na_uchastie> map = new HashMap<Serializable, podtverzhdenie_na_uchastie>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie = fetchByPrimaryKey(primaryKey);

			if (podtverzhdenie_na_uchastie != null) {
				map.put(primaryKey, podtverzhdenie_na_uchastie);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
					podtverzhdenie_na_uchastieImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (podtverzhdenie_na_uchastie)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PODTVERZHDENIE_NA_UCHASTIE_WHERE_PKS_IN);

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

			for (podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie : (List<podtverzhdenie_na_uchastie>)q.list()) {
				map.put(podtverzhdenie_na_uchastie.getPrimaryKeyObj(),
					podtverzhdenie_na_uchastie);

				cacheResult(podtverzhdenie_na_uchastie);

				uncachedPrimaryKeys.remove(podtverzhdenie_na_uchastie.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(podtverzhdenie_na_uchastieModelImpl.ENTITY_CACHE_ENABLED,
					podtverzhdenie_na_uchastieImpl.class, primaryKey, nullModel);
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
	 * Returns all the podtverzhdenie_na_uchasties.
	 *
	 * @return the podtverzhdenie_na_uchasties
	 */
	@Override
	public List<podtverzhdenie_na_uchastie> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the podtverzhdenie_na_uchasties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podtverzhdenie_na_uchasties
	 * @param end the upper bound of the range of podtverzhdenie_na_uchasties (not inclusive)
	 * @return the range of podtverzhdenie_na_uchasties
	 */
	@Override
	public List<podtverzhdenie_na_uchastie> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the podtverzhdenie_na_uchasties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podtverzhdenie_na_uchasties
	 * @param end the upper bound of the range of podtverzhdenie_na_uchasties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of podtverzhdenie_na_uchasties
	 */
	@Override
	public List<podtverzhdenie_na_uchastie> findAll(int start, int end,
		OrderByComparator<podtverzhdenie_na_uchastie> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the podtverzhdenie_na_uchasties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link podtverzhdenie_na_uchastieModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of podtverzhdenie_na_uchasties
	 * @param end the upper bound of the range of podtverzhdenie_na_uchasties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of podtverzhdenie_na_uchasties
	 */
	@Override
	public List<podtverzhdenie_na_uchastie> findAll(int start, int end,
		OrderByComparator<podtverzhdenie_na_uchastie> orderByComparator,
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

		List<podtverzhdenie_na_uchastie> list = null;

		if (retrieveFromCache) {
			list = (List<podtverzhdenie_na_uchastie>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PODTVERZHDENIE_NA_UCHASTIE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PODTVERZHDENIE_NA_UCHASTIE;

				if (pagination) {
					sql = sql.concat(podtverzhdenie_na_uchastieModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<podtverzhdenie_na_uchastie>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<podtverzhdenie_na_uchastie>)QueryUtil.list(q,
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
	 * Removes all the podtverzhdenie_na_uchasties from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie : findAll()) {
			remove(podtverzhdenie_na_uchastie);
		}
	}

	/**
	 * Returns the number of podtverzhdenie_na_uchasties.
	 *
	 * @return the number of podtverzhdenie_na_uchasties
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PODTVERZHDENIE_NA_UCHASTIE);

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
		return podtverzhdenie_na_uchastieModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the podtverzhdenie_na_uchastie persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(podtverzhdenie_na_uchastieImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PODTVERZHDENIE_NA_UCHASTIE = "SELECT podtverzhdenie_na_uchastie FROM podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie";
	private static final String _SQL_SELECT_PODTVERZHDENIE_NA_UCHASTIE_WHERE_PKS_IN =
		"SELECT podtverzhdenie_na_uchastie FROM podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie WHERE podtverzhdenie_na_uchastie_id IN (";
	private static final String _SQL_COUNT_PODTVERZHDENIE_NA_UCHASTIE = "SELECT COUNT(podtverzhdenie_na_uchastie) FROM podtverzhdenie_na_uchastie podtverzhdenie_na_uchastie";
	private static final String _ORDER_BY_ENTITY_ALIAS = "podtverzhdenie_na_uchastie.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No podtverzhdenie_na_uchastie exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(podtverzhdenie_na_uchastiePersistenceImpl.class);
}