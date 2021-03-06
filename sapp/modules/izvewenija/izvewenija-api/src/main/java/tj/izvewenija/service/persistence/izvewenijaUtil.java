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

package tj.izvewenija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.izvewenija.model.izvewenija;

import java.util.List;

/**
 * The persistence utility for the izvewenija service. This utility wraps {@link tj.izvewenija.service.persistence.impl.izvewenijaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see izvewenijaPersistence
 * @see tj.izvewenija.service.persistence.impl.izvewenijaPersistenceImpl
 * @generated
 */
@ProviderType
public class izvewenijaUtil {
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
	public static void clearCache(izvewenija izvewenija) {
		getPersistence().clearCache(izvewenija);
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
	public static List<izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<izvewenija> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<izvewenija> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static izvewenija update(izvewenija izvewenija) {
		return getPersistence().update(izvewenija);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static izvewenija update(izvewenija izvewenija,
		ServiceContext serviceContext) {
		return getPersistence().update(izvewenija, serviceContext);
	}

	/**
	* Caches the izvewenija in the entity cache if it is enabled.
	*
	* @param izvewenija the izvewenija
	*/
	public static void cacheResult(izvewenija izvewenija) {
		getPersistence().cacheResult(izvewenija);
	}

	/**
	* Caches the izvewenijas in the entity cache if it is enabled.
	*
	* @param izvewenijas the izvewenijas
	*/
	public static void cacheResult(List<izvewenija> izvewenijas) {
		getPersistence().cacheResult(izvewenijas);
	}

	/**
	* Creates a new izvewenija with the primary key. Does not add the izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new izvewenija
	* @return the new izvewenija
	*/
	public static izvewenija create(long izvewenija_id) {
		return getPersistence().create(izvewenija_id);
	}

	/**
	* Removes the izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija that was removed
	* @throws NoSuchizvewenijaException if a izvewenija with the primary key could not be found
	*/
	public static izvewenija remove(long izvewenija_id)
		throws tj.izvewenija.exception.NoSuchizvewenijaException {
		return getPersistence().remove(izvewenija_id);
	}

	public static izvewenija updateImpl(izvewenija izvewenija) {
		return getPersistence().updateImpl(izvewenija);
	}

	/**
	* Returns the izvewenija with the primary key or throws a {@link NoSuchizvewenijaException} if it could not be found.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija
	* @throws NoSuchizvewenijaException if a izvewenija with the primary key could not be found
	*/
	public static izvewenija findByPrimaryKey(long izvewenija_id)
		throws tj.izvewenija.exception.NoSuchizvewenijaException {
		return getPersistence().findByPrimaryKey(izvewenija_id);
	}

	/**
	* Returns the izvewenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija, or <code>null</code> if a izvewenija with the primary key could not be found
	*/
	public static izvewenija fetchByPrimaryKey(long izvewenija_id) {
		return getPersistence().fetchByPrimaryKey(izvewenija_id);
	}

	public static java.util.Map<java.io.Serializable, izvewenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the izvewenijas.
	*
	* @return the izvewenijas
	*/
	public static List<izvewenija> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of izvewenijas
	*/
	public static List<izvewenija> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of izvewenijas
	*/
	public static List<izvewenija> findAll(int start, int end,
		OrderByComparator<izvewenija> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of izvewenijas
	*/
	public static List<izvewenija> findAll(int start, int end,
		OrderByComparator<izvewenija> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the izvewenijas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of izvewenijas.
	*
	* @return the number of izvewenijas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static izvewenijaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<izvewenijaPersistence, izvewenijaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(izvewenijaPersistence.class);
}