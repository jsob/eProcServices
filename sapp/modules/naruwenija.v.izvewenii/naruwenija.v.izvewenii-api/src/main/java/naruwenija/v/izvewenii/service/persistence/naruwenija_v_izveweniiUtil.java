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

package naruwenija.v.izvewenii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import naruwenija.v.izvewenii.model.naruwenija_v_izvewenii;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the naruwenija_v_izvewenii service. This utility wraps {@link naruwenija.v.izvewenii.service.persistence.impl.naruwenija_v_izveweniiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija_v_izveweniiPersistence
 * @see naruwenija.v.izvewenii.service.persistence.impl.naruwenija_v_izveweniiPersistenceImpl
 * @generated
 */
@ProviderType
public class naruwenija_v_izveweniiUtil {
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
	public static void clearCache(naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		getPersistence().clearCache(naruwenija_v_izvewenii);
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
	public static List<naruwenija_v_izvewenii> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<naruwenija_v_izvewenii> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<naruwenija_v_izvewenii> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<naruwenija_v_izvewenii> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static naruwenija_v_izvewenii update(
		naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		return getPersistence().update(naruwenija_v_izvewenii);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static naruwenija_v_izvewenii update(
		naruwenija_v_izvewenii naruwenija_v_izvewenii,
		ServiceContext serviceContext) {
		return getPersistence().update(naruwenija_v_izvewenii, serviceContext);
	}

	/**
	* Caches the naruwenija_v_izvewenii in the entity cache if it is enabled.
	*
	* @param naruwenija_v_izvewenii the naruwenija_v_izvewenii
	*/
	public static void cacheResult(
		naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		getPersistence().cacheResult(naruwenija_v_izvewenii);
	}

	/**
	* Caches the naruwenija_v_izveweniis in the entity cache if it is enabled.
	*
	* @param naruwenija_v_izveweniis the naruwenija_v_izveweniis
	*/
	public static void cacheResult(
		List<naruwenija_v_izvewenii> naruwenija_v_izveweniis) {
		getPersistence().cacheResult(naruwenija_v_izveweniis);
	}

	/**
	* Creates a new naruwenija_v_izvewenii with the primary key. Does not add the naruwenija_v_izvewenii to the database.
	*
	* @param naruwenija_v_izvewenii_id the primary key for the new naruwenija_v_izvewenii
	* @return the new naruwenija_v_izvewenii
	*/
	public static naruwenija_v_izvewenii create(long naruwenija_v_izvewenii_id) {
		return getPersistence().create(naruwenija_v_izvewenii_id);
	}

	/**
	* Removes the naruwenija_v_izvewenii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii that was removed
	* @throws NoSuchnaruwenija_v_izveweniiException if a naruwenija_v_izvewenii with the primary key could not be found
	*/
	public static naruwenija_v_izvewenii remove(long naruwenija_v_izvewenii_id)
		throws naruwenija.v.izvewenii.exception.NoSuchnaruwenija_v_izveweniiException {
		return getPersistence().remove(naruwenija_v_izvewenii_id);
	}

	public static naruwenija_v_izvewenii updateImpl(
		naruwenija_v_izvewenii naruwenija_v_izvewenii) {
		return getPersistence().updateImpl(naruwenija_v_izvewenii);
	}

	/**
	* Returns the naruwenija_v_izvewenii with the primary key or throws a {@link NoSuchnaruwenija_v_izveweniiException} if it could not be found.
	*
	* @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii
	* @throws NoSuchnaruwenija_v_izveweniiException if a naruwenija_v_izvewenii with the primary key could not be found
	*/
	public static naruwenija_v_izvewenii findByPrimaryKey(
		long naruwenija_v_izvewenii_id)
		throws naruwenija.v.izvewenii.exception.NoSuchnaruwenija_v_izveweniiException {
		return getPersistence().findByPrimaryKey(naruwenija_v_izvewenii_id);
	}

	/**
	* Returns the naruwenija_v_izvewenii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii, or <code>null</code> if a naruwenija_v_izvewenii with the primary key could not be found
	*/
	public static naruwenija_v_izvewenii fetchByPrimaryKey(
		long naruwenija_v_izvewenii_id) {
		return getPersistence().fetchByPrimaryKey(naruwenija_v_izvewenii_id);
	}

	public static java.util.Map<java.io.Serializable, naruwenija_v_izvewenii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the naruwenija_v_izveweniis.
	*
	* @return the naruwenija_v_izveweniis
	*/
	public static List<naruwenija_v_izvewenii> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the naruwenija_v_izveweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of naruwenija_v_izveweniis
	* @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	* @return the range of naruwenija_v_izveweniis
	*/
	public static List<naruwenija_v_izvewenii> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the naruwenija_v_izveweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of naruwenija_v_izveweniis
	* @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of naruwenija_v_izveweniis
	*/
	public static List<naruwenija_v_izvewenii> findAll(int start, int end,
		OrderByComparator<naruwenija_v_izvewenii> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the naruwenija_v_izveweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of naruwenija_v_izveweniis
	* @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of naruwenija_v_izveweniis
	*/
	public static List<naruwenija_v_izvewenii> findAll(int start, int end,
		OrderByComparator<naruwenija_v_izvewenii> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the naruwenija_v_izveweniis from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of naruwenija_v_izveweniis.
	*
	* @return the number of naruwenija_v_izveweniis
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static naruwenija_v_izveweniiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<naruwenija_v_izveweniiPersistence, naruwenija_v_izveweniiPersistence> _serviceTracker =
		ServiceTrackerFactory.open(naruwenija_v_izveweniiPersistence.class);
}