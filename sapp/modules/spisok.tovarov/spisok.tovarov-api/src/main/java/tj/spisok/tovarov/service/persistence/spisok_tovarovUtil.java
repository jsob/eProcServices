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

package tj.spisok.tovarov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.spisok.tovarov.model.spisok_tovarov;

import java.util.List;

/**
 * The persistence utility for the spisok_tovarov service. This utility wraps {@link tj.spisok.tovarov.service.persistence.impl.spisok_tovarovPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarovPersistence
 * @see tj.spisok.tovarov.service.persistence.impl.spisok_tovarovPersistenceImpl
 * @generated
 */
@ProviderType
public class spisok_tovarovUtil {
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
	public static void clearCache(spisok_tovarov spisok_tovarov) {
		getPersistence().clearCache(spisok_tovarov);
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
	public static List<spisok_tovarov> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<spisok_tovarov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<spisok_tovarov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<spisok_tovarov> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static spisok_tovarov update(spisok_tovarov spisok_tovarov) {
		return getPersistence().update(spisok_tovarov);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static spisok_tovarov update(spisok_tovarov spisok_tovarov,
		ServiceContext serviceContext) {
		return getPersistence().update(spisok_tovarov, serviceContext);
	}

	/**
	* Caches the spisok_tovarov in the entity cache if it is enabled.
	*
	* @param spisok_tovarov the spisok_tovarov
	*/
	public static void cacheResult(spisok_tovarov spisok_tovarov) {
		getPersistence().cacheResult(spisok_tovarov);
	}

	/**
	* Caches the spisok_tovarovs in the entity cache if it is enabled.
	*
	* @param spisok_tovarovs the spisok_tovarovs
	*/
	public static void cacheResult(List<spisok_tovarov> spisok_tovarovs) {
		getPersistence().cacheResult(spisok_tovarovs);
	}

	/**
	* Creates a new spisok_tovarov with the primary key. Does not add the spisok_tovarov to the database.
	*
	* @param spisok_tovarov_id the primary key for the new spisok_tovarov
	* @return the new spisok_tovarov
	*/
	public static spisok_tovarov create(long spisok_tovarov_id) {
		return getPersistence().create(spisok_tovarov_id);
	}

	/**
	* Removes the spisok_tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_id the primary key of the spisok_tovarov
	* @return the spisok_tovarov that was removed
	* @throws NoSuchspisok_tovarovException if a spisok_tovarov with the primary key could not be found
	*/
	public static spisok_tovarov remove(long spisok_tovarov_id)
		throws tj.spisok.tovarov.exception.NoSuchspisok_tovarovException {
		return getPersistence().remove(spisok_tovarov_id);
	}

	public static spisok_tovarov updateImpl(spisok_tovarov spisok_tovarov) {
		return getPersistence().updateImpl(spisok_tovarov);
	}

	/**
	* Returns the spisok_tovarov with the primary key or throws a {@link NoSuchspisok_tovarovException} if it could not be found.
	*
	* @param spisok_tovarov_id the primary key of the spisok_tovarov
	* @return the spisok_tovarov
	* @throws NoSuchspisok_tovarovException if a spisok_tovarov with the primary key could not be found
	*/
	public static spisok_tovarov findByPrimaryKey(long spisok_tovarov_id)
		throws tj.spisok.tovarov.exception.NoSuchspisok_tovarovException {
		return getPersistence().findByPrimaryKey(spisok_tovarov_id);
	}

	/**
	* Returns the spisok_tovarov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_tovarov_id the primary key of the spisok_tovarov
	* @return the spisok_tovarov, or <code>null</code> if a spisok_tovarov with the primary key could not be found
	*/
	public static spisok_tovarov fetchByPrimaryKey(long spisok_tovarov_id) {
		return getPersistence().fetchByPrimaryKey(spisok_tovarov_id);
	}

	public static java.util.Map<java.io.Serializable, spisok_tovarov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the spisok_tovarovs.
	*
	* @return the spisok_tovarovs
	*/
	public static List<spisok_tovarov> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the spisok_tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarovs
	* @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	* @return the range of spisok_tovarovs
	*/
	public static List<spisok_tovarov> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the spisok_tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarovs
	* @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of spisok_tovarovs
	*/
	public static List<spisok_tovarov> findAll(int start, int end,
		OrderByComparator<spisok_tovarov> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the spisok_tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarovs
	* @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of spisok_tovarovs
	*/
	public static List<spisok_tovarov> findAll(int start, int end,
		OrderByComparator<spisok_tovarov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the spisok_tovarovs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of spisok_tovarovs.
	*
	* @return the number of spisok_tovarovs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static spisok_tovarovPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<spisok_tovarovPersistence, spisok_tovarovPersistence> _serviceTracker =
		ServiceTrackerFactory.open(spisok_tovarovPersistence.class);
}