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

package tj.goroda.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.goroda.model.goroda;

import java.util.List;

/**
 * The persistence utility for the goroda service. This utility wraps {@link tj.goroda.service.persistence.impl.gorodaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see gorodaPersistence
 * @see tj.goroda.service.persistence.impl.gorodaPersistenceImpl
 * @generated
 */
@ProviderType
public class gorodaUtil {
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
	public static void clearCache(goroda goroda) {
		getPersistence().clearCache(goroda);
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
	public static List<goroda> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<goroda> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<goroda> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<goroda> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static goroda update(goroda goroda) {
		return getPersistence().update(goroda);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static goroda update(goroda goroda, ServiceContext serviceContext) {
		return getPersistence().update(goroda, serviceContext);
	}

	/**
	* Caches the goroda in the entity cache if it is enabled.
	*
	* @param goroda the goroda
	*/
	public static void cacheResult(goroda goroda) {
		getPersistence().cacheResult(goroda);
	}

	/**
	* Caches the gorodas in the entity cache if it is enabled.
	*
	* @param gorodas the gorodas
	*/
	public static void cacheResult(List<goroda> gorodas) {
		getPersistence().cacheResult(gorodas);
	}

	/**
	* Creates a new goroda with the primary key. Does not add the goroda to the database.
	*
	* @param goroda_id the primary key for the new goroda
	* @return the new goroda
	*/
	public static goroda create(long goroda_id) {
		return getPersistence().create(goroda_id);
	}

	/**
	* Removes the goroda with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param goroda_id the primary key of the goroda
	* @return the goroda that was removed
	* @throws NoSuchgorodaException if a goroda with the primary key could not be found
	*/
	public static goroda remove(long goroda_id)
		throws tj.goroda.exception.NoSuchgorodaException {
		return getPersistence().remove(goroda_id);
	}

	public static goroda updateImpl(goroda goroda) {
		return getPersistence().updateImpl(goroda);
	}

	/**
	* Returns the goroda with the primary key or throws a {@link NoSuchgorodaException} if it could not be found.
	*
	* @param goroda_id the primary key of the goroda
	* @return the goroda
	* @throws NoSuchgorodaException if a goroda with the primary key could not be found
	*/
	public static goroda findByPrimaryKey(long goroda_id)
		throws tj.goroda.exception.NoSuchgorodaException {
		return getPersistence().findByPrimaryKey(goroda_id);
	}

	/**
	* Returns the goroda with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param goroda_id the primary key of the goroda
	* @return the goroda, or <code>null</code> if a goroda with the primary key could not be found
	*/
	public static goroda fetchByPrimaryKey(long goroda_id) {
		return getPersistence().fetchByPrimaryKey(goroda_id);
	}

	public static java.util.Map<java.io.Serializable, goroda> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the gorodas.
	*
	* @return the gorodas
	*/
	public static List<goroda> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the gorodas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of gorodas
	* @param end the upper bound of the range of gorodas (not inclusive)
	* @return the range of gorodas
	*/
	public static List<goroda> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the gorodas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of gorodas
	* @param end the upper bound of the range of gorodas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of gorodas
	*/
	public static List<goroda> findAll(int start, int end,
		OrderByComparator<goroda> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the gorodas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of gorodas
	* @param end the upper bound of the range of gorodas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of gorodas
	*/
	public static List<goroda> findAll(int start, int end,
		OrderByComparator<goroda> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the gorodas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of gorodas.
	*
	* @return the number of gorodas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static gorodaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<gorodaPersistence, gorodaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(gorodaPersistence.class);
}