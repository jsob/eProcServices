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

package tj.tipy.dokumentov.postavwika.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.tipy.dokumentov.postavwika.model.tipy_dokumentov_postavwika;

import java.util.List;

/**
 * The persistence utility for the tipy_dokumentov_postavwika service. This utility wraps {@link tj.tipy.dokumentov.postavwika.service.persistence.impl.tipy_dokumentov_postavwikaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_dokumentov_postavwikaPersistence
 * @see tj.tipy.dokumentov.postavwika.service.persistence.impl.tipy_dokumentov_postavwikaPersistenceImpl
 * @generated
 */
@ProviderType
public class tipy_dokumentov_postavwikaUtil {
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
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		getPersistence().clearCache(tipy_dokumentov_postavwika);
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
	public static List<tipy_dokumentov_postavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<tipy_dokumentov_postavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<tipy_dokumentov_postavwika> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<tipy_dokumentov_postavwika> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static tipy_dokumentov_postavwika update(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		return getPersistence().update(tipy_dokumentov_postavwika);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static tipy_dokumentov_postavwika update(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(tipy_dokumentov_postavwika, serviceContext);
	}

	/**
	* Caches the tipy_dokumentov_postavwika in the entity cache if it is enabled.
	*
	* @param tipy_dokumentov_postavwika the tipy_dokumentov_postavwika
	*/
	public static void cacheResult(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		getPersistence().cacheResult(tipy_dokumentov_postavwika);
	}

	/**
	* Caches the tipy_dokumentov_postavwikas in the entity cache if it is enabled.
	*
	* @param tipy_dokumentov_postavwikas the tipy_dokumentov_postavwikas
	*/
	public static void cacheResult(
		List<tipy_dokumentov_postavwika> tipy_dokumentov_postavwikas) {
		getPersistence().cacheResult(tipy_dokumentov_postavwikas);
	}

	/**
	* Creates a new tipy_dokumentov_postavwika with the primary key. Does not add the tipy_dokumentov_postavwika to the database.
	*
	* @param tipy_dokumentov_postavwika_id the primary key for the new tipy_dokumentov_postavwika
	* @return the new tipy_dokumentov_postavwika
	*/
	public static tipy_dokumentov_postavwika create(
		long tipy_dokumentov_postavwika_id) {
		return getPersistence().create(tipy_dokumentov_postavwika_id);
	}

	/**
	* Removes the tipy_dokumentov_postavwika with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika that was removed
	* @throws NoSuchtipy_dokumentov_postavwikaException if a tipy_dokumentov_postavwika with the primary key could not be found
	*/
	public static tipy_dokumentov_postavwika remove(
		long tipy_dokumentov_postavwika_id)
		throws tj.tipy.dokumentov.postavwika.exception.NoSuchtipy_dokumentov_postavwikaException {
		return getPersistence().remove(tipy_dokumentov_postavwika_id);
	}

	public static tipy_dokumentov_postavwika updateImpl(
		tipy_dokumentov_postavwika tipy_dokumentov_postavwika) {
		return getPersistence().updateImpl(tipy_dokumentov_postavwika);
	}

	/**
	* Returns the tipy_dokumentov_postavwika with the primary key or throws a {@link NoSuchtipy_dokumentov_postavwikaException} if it could not be found.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika
	* @throws NoSuchtipy_dokumentov_postavwikaException if a tipy_dokumentov_postavwika with the primary key could not be found
	*/
	public static tipy_dokumentov_postavwika findByPrimaryKey(
		long tipy_dokumentov_postavwika_id)
		throws tj.tipy.dokumentov.postavwika.exception.NoSuchtipy_dokumentov_postavwikaException {
		return getPersistence().findByPrimaryKey(tipy_dokumentov_postavwika_id);
	}

	/**
	* Returns the tipy_dokumentov_postavwika with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_dokumentov_postavwika_id the primary key of the tipy_dokumentov_postavwika
	* @return the tipy_dokumentov_postavwika, or <code>null</code> if a tipy_dokumentov_postavwika with the primary key could not be found
	*/
	public static tipy_dokumentov_postavwika fetchByPrimaryKey(
		long tipy_dokumentov_postavwika_id) {
		return getPersistence().fetchByPrimaryKey(tipy_dokumentov_postavwika_id);
	}

	public static java.util.Map<java.io.Serializable, tipy_dokumentov_postavwika> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tipy_dokumentov_postavwikas.
	*
	* @return the tipy_dokumentov_postavwikas
	*/
	public static List<tipy_dokumentov_postavwika> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tipy_dokumentov_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_dokumentov_postavwikas
	* @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	* @return the range of tipy_dokumentov_postavwikas
	*/
	public static List<tipy_dokumentov_postavwika> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tipy_dokumentov_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_dokumentov_postavwikas
	* @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy_dokumentov_postavwikas
	*/
	public static List<tipy_dokumentov_postavwika> findAll(int start, int end,
		OrderByComparator<tipy_dokumentov_postavwika> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipy_dokumentov_postavwikas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_dokumentov_postavwikaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_dokumentov_postavwikas
	* @param end the upper bound of the range of tipy_dokumentov_postavwikas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy_dokumentov_postavwikas
	*/
	public static List<tipy_dokumentov_postavwika> findAll(int start, int end,
		OrderByComparator<tipy_dokumentov_postavwika> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tipy_dokumentov_postavwikas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipy_dokumentov_postavwikas.
	*
	* @return the number of tipy_dokumentov_postavwikas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static tipy_dokumentov_postavwikaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<tipy_dokumentov_postavwikaPersistence, tipy_dokumentov_postavwikaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(tipy_dokumentov_postavwikaPersistence.class);
}