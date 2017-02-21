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

package tj.balans.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.balans.postavwika.model.balans_postavwika;

import java.util.List;

/**
 * The persistence utility for the balans_postavwika service. This utility wraps {@link tj.balans.postavwika.service.persistence.impl.balans_postavwikaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see balans_postavwikaPersistence
 * @see tj.balans.postavwika.service.persistence.impl.balans_postavwikaPersistenceImpl
 * @generated
 */
@ProviderType
public class balans_postavwikaUtil {
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
	public static void clearCache(balans_postavwika balans_postavwika) {
		getPersistence().clearCache(balans_postavwika);
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
	public static List<balans_postavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<balans_postavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<balans_postavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<balans_postavwika> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static balans_postavwika update(balans_postavwika balans_postavwika) {
		return getPersistence().update(balans_postavwika);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static balans_postavwika update(
		balans_postavwika balans_postavwika, ServiceContext serviceContext) {
		return getPersistence().update(balans_postavwika, serviceContext);
	}

	/**
	* Caches the balans_postavwika in the entity cache if it is enabled.
	*
	* @param balans_postavwika the balans_postavwika
	*/
	public static void cacheResult(balans_postavwika balans_postavwika) {
		getPersistence().cacheResult(balans_postavwika);
	}

	/**
	* Caches the balans_postavwikas in the entity cache if it is enabled.
	*
	* @param balans_postavwikas the balans_postavwikas
	*/
	public static void cacheResult(List<balans_postavwika> balans_postavwikas) {
		getPersistence().cacheResult(balans_postavwikas);
	}

	/**
	* Creates a new balans_postavwika with the primary key. Does not add the balans_postavwika to the database.
	*
	* @param balans_postavwika_id the primary key for the new balans_postavwika
	* @return the new balans_postavwika
	*/
	public static balans_postavwika create(long balans_postavwika_id) {
		return getPersistence().create(balans_postavwika_id);
	}

	/**
	* Removes the balans_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param balans_postavwika_id the primary key of the balans_postavwika
	* @return the balans_postavwika that was removed
	* @throws NoSuchbalans_postavwikaException if a balans_postavwika with the primary key could not be found
	*/
	public static balans_postavwika remove(long balans_postavwika_id)
		throws tj.balans.postavwika.exception.NoSuchbalans_postavwikaException {
		return getPersistence().remove(balans_postavwika_id);
	}

	public static balans_postavwika updateImpl(
		balans_postavwika balans_postavwika) {
		return getPersistence().updateImpl(balans_postavwika);
	}

	/**
	* Returns the balans_postavwika with the primary key or throws a {@link NoSuchbalans_postavwikaException} if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the balans_postavwika
	* @return the balans_postavwika
	* @throws NoSuchbalans_postavwikaException if a balans_postavwika with the primary key could not be found
	*/
	public static balans_postavwika findByPrimaryKey(long balans_postavwika_id)
		throws tj.balans.postavwika.exception.NoSuchbalans_postavwikaException {
		return getPersistence().findByPrimaryKey(balans_postavwika_id);
	}

	/**
	* Returns the balans_postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param balans_postavwika_id the primary key of the balans_postavwika
	* @return the balans_postavwika, or <code>null</code> if a balans_postavwika with the primary key could not be found
	*/
	public static balans_postavwika fetchByPrimaryKey(long balans_postavwika_id) {
		return getPersistence().fetchByPrimaryKey(balans_postavwika_id);
	}

	public static java.util.Map<java.io.Serializable, balans_postavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the balans_postavwikas.
	*
	* @return the balans_postavwikas
	*/
	public static List<balans_postavwika> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the balans_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans_postavwikas
	* @param end the upper bound of the range of balans_postavwikas (not inclusive)
	* @return the range of balans_postavwikas
	*/
	public static List<balans_postavwika> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the balans_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans_postavwikas
	* @param end the upper bound of the range of balans_postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of balans_postavwikas
	*/
	public static List<balans_postavwika> findAll(int start, int end,
		OrderByComparator<balans_postavwika> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the balans_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link balans_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of balans_postavwikas
	* @param end the upper bound of the range of balans_postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of balans_postavwikas
	*/
	public static List<balans_postavwika> findAll(int start, int end,
		OrderByComparator<balans_postavwika> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the balans_postavwikas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of balans_postavwikas.
	*
	* @return the number of balans_postavwikas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static balans_postavwikaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<balans_postavwikaPersistence, balans_postavwikaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(balans_postavwikaPersistence.class);
}