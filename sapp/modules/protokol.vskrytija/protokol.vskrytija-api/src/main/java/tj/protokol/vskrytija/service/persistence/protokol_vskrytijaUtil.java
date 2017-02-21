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

package tj.protokol.vskrytija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.protokol.vskrytija.model.protokol_vskrytija;

import java.util.List;

/**
 * The persistence utility for the protokol_vskrytija service. This utility wraps {@link tj.protokol.vskrytija.service.persistence.impl.protokol_vskrytijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see protokol_vskrytijaPersistence
 * @see tj.protokol.vskrytija.service.persistence.impl.protokol_vskrytijaPersistenceImpl
 * @generated
 */
@ProviderType
public class protokol_vskrytijaUtil {
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
	public static void clearCache(protokol_vskrytija protokol_vskrytija) {
		getPersistence().clearCache(protokol_vskrytija);
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
	public static List<protokol_vskrytija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<protokol_vskrytija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<protokol_vskrytija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<protokol_vskrytija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static protokol_vskrytija update(
		protokol_vskrytija protokol_vskrytija) {
		return getPersistence().update(protokol_vskrytija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static protokol_vskrytija update(
		protokol_vskrytija protokol_vskrytija, ServiceContext serviceContext) {
		return getPersistence().update(protokol_vskrytija, serviceContext);
	}

	/**
	* Caches the protokol_vskrytija in the entity cache if it is enabled.
	*
	* @param protokol_vskrytija the protokol_vskrytija
	*/
	public static void cacheResult(protokol_vskrytija protokol_vskrytija) {
		getPersistence().cacheResult(protokol_vskrytija);
	}

	/**
	* Caches the protokol_vskrytijas in the entity cache if it is enabled.
	*
	* @param protokol_vskrytijas the protokol_vskrytijas
	*/
	public static void cacheResult(List<protokol_vskrytija> protokol_vskrytijas) {
		getPersistence().cacheResult(protokol_vskrytijas);
	}

	/**
	* Creates a new protokol_vskrytija with the primary key. Does not add the protokol_vskrytija to the database.
	*
	* @param protokol_vskrytija_id the primary key for the new protokol_vskrytija
	* @return the new protokol_vskrytija
	*/
	public static protokol_vskrytija create(long protokol_vskrytija_id) {
		return getPersistence().create(protokol_vskrytija_id);
	}

	/**
	* Removes the protokol_vskrytija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	* @return the protokol_vskrytija that was removed
	* @throws NoSuchprotokol_vskrytijaException if a protokol_vskrytija with the primary key could not be found
	*/
	public static protokol_vskrytija remove(long protokol_vskrytija_id)
		throws tj.protokol.vskrytija.exception.NoSuchprotokol_vskrytijaException {
		return getPersistence().remove(protokol_vskrytija_id);
	}

	public static protokol_vskrytija updateImpl(
		protokol_vskrytija protokol_vskrytija) {
		return getPersistence().updateImpl(protokol_vskrytija);
	}

	/**
	* Returns the protokol_vskrytija with the primary key or throws a {@link NoSuchprotokol_vskrytijaException} if it could not be found.
	*
	* @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	* @return the protokol_vskrytija
	* @throws NoSuchprotokol_vskrytijaException if a protokol_vskrytija with the primary key could not be found
	*/
	public static protokol_vskrytija findByPrimaryKey(
		long protokol_vskrytija_id)
		throws tj.protokol.vskrytija.exception.NoSuchprotokol_vskrytijaException {
		return getPersistence().findByPrimaryKey(protokol_vskrytija_id);
	}

	/**
	* Returns the protokol_vskrytija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	* @return the protokol_vskrytija, or <code>null</code> if a protokol_vskrytija with the primary key could not be found
	*/
	public static protokol_vskrytija fetchByPrimaryKey(
		long protokol_vskrytija_id) {
		return getPersistence().fetchByPrimaryKey(protokol_vskrytija_id);
	}

	public static java.util.Map<java.io.Serializable, protokol_vskrytija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the protokol_vskrytijas.
	*
	* @return the protokol_vskrytijas
	*/
	public static List<protokol_vskrytija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the protokol_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_vskrytijas
	* @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	* @return the range of protokol_vskrytijas
	*/
	public static List<protokol_vskrytija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the protokol_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_vskrytijas
	* @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protokol_vskrytijas
	*/
	public static List<protokol_vskrytija> findAll(int start, int end,
		OrderByComparator<protokol_vskrytija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the protokol_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_vskrytijas
	* @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of protokol_vskrytijas
	*/
	public static List<protokol_vskrytija> findAll(int start, int end,
		OrderByComparator<protokol_vskrytija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the protokol_vskrytijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of protokol_vskrytijas.
	*
	* @return the number of protokol_vskrytijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static protokol_vskrytijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<protokol_vskrytijaPersistence, protokol_vskrytijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(protokol_vskrytijaPersistence.class);
}