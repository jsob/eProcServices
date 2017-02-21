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

package tj.tipy.organizacij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.tipy.organizacij.model.tipy_organizacij;

import java.util.List;

/**
 * The persistence utility for the tipy_organizacij service. This utility wraps {@link tj.tipy.organizacij.service.persistence.impl.tipy_organizacijPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tipy_organizacijPersistence
 * @see tj.tipy.organizacij.service.persistence.impl.tipy_organizacijPersistenceImpl
 * @generated
 */
@ProviderType
public class tipy_organizacijUtil {
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
	public static void clearCache(tipy_organizacij tipy_organizacij) {
		getPersistence().clearCache(tipy_organizacij);
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
	public static List<tipy_organizacij> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<tipy_organizacij> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<tipy_organizacij> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<tipy_organizacij> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static tipy_organizacij update(tipy_organizacij tipy_organizacij) {
		return getPersistence().update(tipy_organizacij);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static tipy_organizacij update(tipy_organizacij tipy_organizacij,
		ServiceContext serviceContext) {
		return getPersistence().update(tipy_organizacij, serviceContext);
	}

	/**
	* Caches the tipy_organizacij in the entity cache if it is enabled.
	*
	* @param tipy_organizacij the tipy_organizacij
	*/
	public static void cacheResult(tipy_organizacij tipy_organizacij) {
		getPersistence().cacheResult(tipy_organizacij);
	}

	/**
	* Caches the tipy_organizacijs in the entity cache if it is enabled.
	*
	* @param tipy_organizacijs the tipy_organizacijs
	*/
	public static void cacheResult(List<tipy_organizacij> tipy_organizacijs) {
		getPersistence().cacheResult(tipy_organizacijs);
	}

	/**
	* Creates a new tipy_organizacij with the primary key. Does not add the tipy_organizacij to the database.
	*
	* @param tipy_organizacij_id the primary key for the new tipy_organizacij
	* @return the new tipy_organizacij
	*/
	public static tipy_organizacij create(long tipy_organizacij_id) {
		return getPersistence().create(tipy_organizacij_id);
	}

	/**
	* Removes the tipy_organizacij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipy_organizacij_id the primary key of the tipy_organizacij
	* @return the tipy_organizacij that was removed
	* @throws NoSuchtipy_organizacijException if a tipy_organizacij with the primary key could not be found
	*/
	public static tipy_organizacij remove(long tipy_organizacij_id)
		throws tj.tipy.organizacij.exception.NoSuchtipy_organizacijException {
		return getPersistence().remove(tipy_organizacij_id);
	}

	public static tipy_organizacij updateImpl(tipy_organizacij tipy_organizacij) {
		return getPersistence().updateImpl(tipy_organizacij);
	}

	/**
	* Returns the tipy_organizacij with the primary key or throws a {@link NoSuchtipy_organizacijException} if it could not be found.
	*
	* @param tipy_organizacij_id the primary key of the tipy_organizacij
	* @return the tipy_organizacij
	* @throws NoSuchtipy_organizacijException if a tipy_organizacij with the primary key could not be found
	*/
	public static tipy_organizacij findByPrimaryKey(long tipy_organizacij_id)
		throws tj.tipy.organizacij.exception.NoSuchtipy_organizacijException {
		return getPersistence().findByPrimaryKey(tipy_organizacij_id);
	}

	/**
	* Returns the tipy_organizacij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipy_organizacij_id the primary key of the tipy_organizacij
	* @return the tipy_organizacij, or <code>null</code> if a tipy_organizacij with the primary key could not be found
	*/
	public static tipy_organizacij fetchByPrimaryKey(long tipy_organizacij_id) {
		return getPersistence().fetchByPrimaryKey(tipy_organizacij_id);
	}

	public static java.util.Map<java.io.Serializable, tipy_organizacij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tipy_organizacijs.
	*
	* @return the tipy_organizacijs
	*/
	public static List<tipy_organizacij> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tipy_organizacijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_organizacijs
	* @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	* @return the range of tipy_organizacijs
	*/
	public static List<tipy_organizacij> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tipy_organizacijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_organizacijs
	* @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipy_organizacijs
	*/
	public static List<tipy_organizacij> findAll(int start, int end,
		OrderByComparator<tipy_organizacij> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipy_organizacijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tipy_organizacijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipy_organizacijs
	* @param end the upper bound of the range of tipy_organizacijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipy_organizacijs
	*/
	public static List<tipy_organizacij> findAll(int start, int end,
		OrderByComparator<tipy_organizacij> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tipy_organizacijs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipy_organizacijs.
	*
	* @return the number of tipy_organizacijs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static tipy_organizacijPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<tipy_organizacijPersistence, tipy_organizacijPersistence> _serviceTracker =
		ServiceTrackerFactory.open(tipy_organizacijPersistence.class);
}