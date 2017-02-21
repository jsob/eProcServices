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

package tj.spisok.tovarov.vremenno.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno;

import java.util.List;

/**
 * The persistence utility for the spisok_tovarov_vremenno service. This utility wraps {@link tj.spisok.tovarov.vremenno.service.persistence.impl.spisok_tovarov_vremennoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see spisok_tovarov_vremennoPersistence
 * @see tj.spisok.tovarov.vremenno.service.persistence.impl.spisok_tovarov_vremennoPersistenceImpl
 * @generated
 */
@ProviderType
public class spisok_tovarov_vremennoUtil {
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
	public static void clearCache(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		getPersistence().clearCache(spisok_tovarov_vremenno);
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
	public static List<spisok_tovarov_vremenno> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<spisok_tovarov_vremenno> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<spisok_tovarov_vremenno> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<spisok_tovarov_vremenno> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static spisok_tovarov_vremenno update(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		return getPersistence().update(spisok_tovarov_vremenno);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static spisok_tovarov_vremenno update(
		spisok_tovarov_vremenno spisok_tovarov_vremenno,
		ServiceContext serviceContext) {
		return getPersistence().update(spisok_tovarov_vremenno, serviceContext);
	}

	/**
	* Caches the spisok_tovarov_vremenno in the entity cache if it is enabled.
	*
	* @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	*/
	public static void cacheResult(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		getPersistence().cacheResult(spisok_tovarov_vremenno);
	}

	/**
	* Caches the spisok_tovarov_vremennos in the entity cache if it is enabled.
	*
	* @param spisok_tovarov_vremennos the spisok_tovarov_vremennos
	*/
	public static void cacheResult(
		List<spisok_tovarov_vremenno> spisok_tovarov_vremennos) {
		getPersistence().cacheResult(spisok_tovarov_vremennos);
	}

	/**
	* Creates a new spisok_tovarov_vremenno with the primary key. Does not add the spisok_tovarov_vremenno to the database.
	*
	* @param spisok_tovarov_vremenno_id the primary key for the new spisok_tovarov_vremenno
	* @return the new spisok_tovarov_vremenno
	*/
	public static spisok_tovarov_vremenno create(
		long spisok_tovarov_vremenno_id) {
		return getPersistence().create(spisok_tovarov_vremenno_id);
	}

	/**
	* Removes the spisok_tovarov_vremenno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was removed
	* @throws NoSuchspisok_tovarov_vremennoException if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	public static spisok_tovarov_vremenno remove(
		long spisok_tovarov_vremenno_id)
		throws tj.spisok.tovarov.vremenno.exception.NoSuchspisok_tovarov_vremennoException {
		return getPersistence().remove(spisok_tovarov_vremenno_id);
	}

	public static spisok_tovarov_vremenno updateImpl(
		spisok_tovarov_vremenno spisok_tovarov_vremenno) {
		return getPersistence().updateImpl(spisok_tovarov_vremenno);
	}

	/**
	* Returns the spisok_tovarov_vremenno with the primary key or throws a {@link NoSuchspisok_tovarov_vremennoException} if it could not be found.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno
	* @throws NoSuchspisok_tovarov_vremennoException if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	public static spisok_tovarov_vremenno findByPrimaryKey(
		long spisok_tovarov_vremenno_id)
		throws tj.spisok.tovarov.vremenno.exception.NoSuchspisok_tovarov_vremennoException {
		return getPersistence().findByPrimaryKey(spisok_tovarov_vremenno_id);
	}

	/**
	* Returns the spisok_tovarov_vremenno with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno, or <code>null</code> if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	public static spisok_tovarov_vremenno fetchByPrimaryKey(
		long spisok_tovarov_vremenno_id) {
		return getPersistence().fetchByPrimaryKey(spisok_tovarov_vremenno_id);
	}

	public static java.util.Map<java.io.Serializable, spisok_tovarov_vremenno> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the spisok_tovarov_vremennos.
	*
	* @return the spisok_tovarov_vremennos
	*/
	public static List<spisok_tovarov_vremenno> findAll() {
		return getPersistence().findAll();
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
	public static List<spisok_tovarov_vremenno> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<spisok_tovarov_vremenno> findAll(int start, int end,
		OrderByComparator<spisok_tovarov_vremenno> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<spisok_tovarov_vremenno> findAll(int start, int end,
		OrderByComparator<spisok_tovarov_vremenno> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the spisok_tovarov_vremennos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of spisok_tovarov_vremennos.
	*
	* @return the number of spisok_tovarov_vremennos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static spisok_tovarov_vremennoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<spisok_tovarov_vremennoPersistence, spisok_tovarov_vremennoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(spisok_tovarov_vremennoPersistence.class);
}