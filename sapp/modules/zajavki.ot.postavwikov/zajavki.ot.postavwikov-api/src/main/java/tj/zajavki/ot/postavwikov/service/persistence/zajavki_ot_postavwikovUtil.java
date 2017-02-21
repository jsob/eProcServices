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

package tj.zajavki.ot.postavwikov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.zajavki.ot.postavwikov.model.zajavki_ot_postavwikov;

import java.util.List;

/**
 * The persistence utility for the zajavki_ot_postavwikov service. This utility wraps {@link tj.zajavki.ot.postavwikov.service.persistence.impl.zajavki_ot_postavwikovPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see zajavki_ot_postavwikovPersistence
 * @see tj.zajavki.ot.postavwikov.service.persistence.impl.zajavki_ot_postavwikovPersistenceImpl
 * @generated
 */
@ProviderType
public class zajavki_ot_postavwikovUtil {
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
	public static void clearCache(zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		getPersistence().clearCache(zajavki_ot_postavwikov);
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
	public static List<zajavki_ot_postavwikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<zajavki_ot_postavwikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<zajavki_ot_postavwikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<zajavki_ot_postavwikov> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static zajavki_ot_postavwikov update(
		zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return getPersistence().update(zajavki_ot_postavwikov);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static zajavki_ot_postavwikov update(
		zajavki_ot_postavwikov zajavki_ot_postavwikov,
		ServiceContext serviceContext) {
		return getPersistence().update(zajavki_ot_postavwikov, serviceContext);
	}

	/**
	* Caches the zajavki_ot_postavwikov in the entity cache if it is enabled.
	*
	* @param zajavki_ot_postavwikov the zajavki_ot_postavwikov
	*/
	public static void cacheResult(
		zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		getPersistence().cacheResult(zajavki_ot_postavwikov);
	}

	/**
	* Caches the zajavki_ot_postavwikovs in the entity cache if it is enabled.
	*
	* @param zajavki_ot_postavwikovs the zajavki_ot_postavwikovs
	*/
	public static void cacheResult(
		List<zajavki_ot_postavwikov> zajavki_ot_postavwikovs) {
		getPersistence().cacheResult(zajavki_ot_postavwikovs);
	}

	/**
	* Creates a new zajavki_ot_postavwikov with the primary key. Does not add the zajavki_ot_postavwikov to the database.
	*
	* @param zajavki_ot_postavwikov_id the primary key for the new zajavki_ot_postavwikov
	* @return the new zajavki_ot_postavwikov
	*/
	public static zajavki_ot_postavwikov create(long zajavki_ot_postavwikov_id) {
		return getPersistence().create(zajavki_ot_postavwikov_id);
	}

	/**
	* Removes the zajavki_ot_postavwikov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov that was removed
	* @throws NoSuchzajavki_ot_postavwikovException if a zajavki_ot_postavwikov with the primary key could not be found
	*/
	public static zajavki_ot_postavwikov remove(long zajavki_ot_postavwikov_id)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchzajavki_ot_postavwikovException {
		return getPersistence().remove(zajavki_ot_postavwikov_id);
	}

	public static zajavki_ot_postavwikov updateImpl(
		zajavki_ot_postavwikov zajavki_ot_postavwikov) {
		return getPersistence().updateImpl(zajavki_ot_postavwikov);
	}

	/**
	* Returns the zajavki_ot_postavwikov with the primary key or throws a {@link NoSuchzajavki_ot_postavwikovException} if it could not be found.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov
	* @throws NoSuchzajavki_ot_postavwikovException if a zajavki_ot_postavwikov with the primary key could not be found
	*/
	public static zajavki_ot_postavwikov findByPrimaryKey(
		long zajavki_ot_postavwikov_id)
		throws tj.zajavki.ot.postavwikov.exception.NoSuchzajavki_ot_postavwikovException {
		return getPersistence().findByPrimaryKey(zajavki_ot_postavwikov_id);
	}

	/**
	* Returns the zajavki_ot_postavwikov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param zajavki_ot_postavwikov_id the primary key of the zajavki_ot_postavwikov
	* @return the zajavki_ot_postavwikov, or <code>null</code> if a zajavki_ot_postavwikov with the primary key could not be found
	*/
	public static zajavki_ot_postavwikov fetchByPrimaryKey(
		long zajavki_ot_postavwikov_id) {
		return getPersistence().fetchByPrimaryKey(zajavki_ot_postavwikov_id);
	}

	public static java.util.Map<java.io.Serializable, zajavki_ot_postavwikov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the zajavki_ot_postavwikovs.
	*
	* @return the zajavki_ot_postavwikovs
	*/
	public static List<zajavki_ot_postavwikov> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the zajavki_ot_postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki_ot_postavwikovs
	* @param end the upper bound of the range of zajavki_ot_postavwikovs (not inclusive)
	* @return the range of zajavki_ot_postavwikovs
	*/
	public static List<zajavki_ot_postavwikov> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the zajavki_ot_postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki_ot_postavwikovs
	* @param end the upper bound of the range of zajavki_ot_postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of zajavki_ot_postavwikovs
	*/
	public static List<zajavki_ot_postavwikov> findAll(int start, int end,
		OrderByComparator<zajavki_ot_postavwikov> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the zajavki_ot_postavwikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link zajavki_ot_postavwikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of zajavki_ot_postavwikovs
	* @param end the upper bound of the range of zajavki_ot_postavwikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of zajavki_ot_postavwikovs
	*/
	public static List<zajavki_ot_postavwikov> findAll(int start, int end,
		OrderByComparator<zajavki_ot_postavwikov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the zajavki_ot_postavwikovs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of zajavki_ot_postavwikovs.
	*
	* @return the number of zajavki_ot_postavwikovs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static zajavki_ot_postavwikovPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<zajavki_ot_postavwikovPersistence, zajavki_ot_postavwikovPersistence> _serviceTracker =
		ServiceTrackerFactory.open(zajavki_ot_postavwikovPersistence.class);
}