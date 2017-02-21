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

package tj.zakazchiki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.zakazchiki.model.zakazchiki;

import java.util.List;

/**
 * The persistence utility for the zakazchiki service. This utility wraps {@link tj.zakazchiki.service.persistence.impl.zakazchikiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see zakazchikiPersistence
 * @see tj.zakazchiki.service.persistence.impl.zakazchikiPersistenceImpl
 * @generated
 */
@ProviderType
public class zakazchikiUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(zakazchiki zakazchiki) {
		getPersistence().clearCache(zakazchiki);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<zakazchiki> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<zakazchiki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<zakazchiki> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<zakazchiki> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static zakazchiki update(zakazchiki zakazchiki) {
		return getPersistence().update(zakazchiki);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static zakazchiki update(zakazchiki zakazchiki,
		ServiceContext serviceContext) {
		return getPersistence().update(zakazchiki, serviceContext);
	}

	/**
	* Caches the zakazchiki in the entity cache if it is enabled.
	*
	* @param zakazchiki the zakazchiki
	*/
	public static void cacheResult(zakazchiki zakazchiki) {
		getPersistence().cacheResult(zakazchiki);
	}

	/**
	* Caches the zakazchikis in the entity cache if it is enabled.
	*
	* @param zakazchikis the zakazchikis
	*/
	public static void cacheResult(List<zakazchiki> zakazchikis) {
		getPersistence().cacheResult(zakazchikis);
	}

	/**
	* Creates a new zakazchiki with the primary key. Does not add the zakazchiki to the database.
	*
	* @param zakazchiki_id the primary key for the new zakazchiki
	* @return the new zakazchiki
	*/
	public static zakazchiki create(long zakazchiki_id) {
		return getPersistence().create(zakazchiki_id);
	}

	/**
	* Removes the zakazchiki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zakazchiki_id the primary key of the zakazchiki
	* @return the zakazchiki that was removed
	* @throws NoSuchzakazchikiException if a zakazchiki with the primary key could not be found
	*/
	public static zakazchiki remove(long zakazchiki_id)
		throws tj.zakazchiki.exception.NoSuchzakazchikiException {
		return getPersistence().remove(zakazchiki_id);
	}

	public static zakazchiki updateImpl(zakazchiki zakazchiki) {
		return getPersistence().updateImpl(zakazchiki);
	}

	/**
	* Returns the zakazchiki with the primary key or throws a {@link NoSuchzakazchikiException} if it could not be found.
	*
	* @param zakazchiki_id the primary key of the zakazchiki
	* @return the zakazchiki
	* @throws NoSuchzakazchikiException if a zakazchiki with the primary key could not be found
	*/
	public static zakazchiki findByPrimaryKey(long zakazchiki_id)
		throws tj.zakazchiki.exception.NoSuchzakazchikiException {
		return getPersistence().findByPrimaryKey(zakazchiki_id);
	}

	/**
	* Returns the zakazchiki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param zakazchiki_id the primary key of the zakazchiki
	* @return the zakazchiki, or <code>null</code> if a zakazchiki with the primary key could not be found
	*/
	public static zakazchiki fetchByPrimaryKey(long zakazchiki_id) {
		return getPersistence().fetchByPrimaryKey(zakazchiki_id);
	}

	public static java.util.Map<java.io.Serializable, zakazchiki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the zakazchikis.
	*
	* @return the zakazchikis
	*/
	public static List<zakazchiki> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the zakazchikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zakazchikis
	* @param end the upper bound of the range of zakazchikis (not inclusive)
	* @return the range of zakazchikis
	*/
	public static List<zakazchiki> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the zakazchikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zakazchikis
	* @param end the upper bound of the range of zakazchikis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of zakazchikis
	*/
	public static List<zakazchiki> findAll(int start, int end,
		OrderByComparator<zakazchiki> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the zakazchikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zakazchikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zakazchikis
	* @param end the upper bound of the range of zakazchikis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of zakazchikis
	*/
	public static List<zakazchiki> findAll(int start, int end,
		OrderByComparator<zakazchiki> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the zakazchikis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of zakazchikis.
	*
	* @return the number of zakazchikis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static zakazchikiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<zakazchikiPersistence, zakazchikiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(zakazchikiPersistence.class);
}