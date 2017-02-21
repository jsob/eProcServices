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

package tj.godovoj.plan.zakupok.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.godovoj.plan.zakupok.model.godovoj_plan_zakupok;

import java.util.List;

/**
 * The persistence utility for the godovoj_plan_zakupok service. This utility wraps {@link tj.godovoj.plan.zakupok.service.persistence.impl.godovoj_plan_zakupokPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see godovoj_plan_zakupokPersistence
 * @see tj.godovoj.plan.zakupok.service.persistence.impl.godovoj_plan_zakupokPersistenceImpl
 * @generated
 */
@ProviderType
public class godovoj_plan_zakupokUtil {
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
	public static void clearCache(godovoj_plan_zakupok godovoj_plan_zakupok) {
		getPersistence().clearCache(godovoj_plan_zakupok);
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
	public static List<godovoj_plan_zakupok> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<godovoj_plan_zakupok> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<godovoj_plan_zakupok> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<godovoj_plan_zakupok> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static godovoj_plan_zakupok update(
		godovoj_plan_zakupok godovoj_plan_zakupok) {
		return getPersistence().update(godovoj_plan_zakupok);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static godovoj_plan_zakupok update(
		godovoj_plan_zakupok godovoj_plan_zakupok, ServiceContext serviceContext) {
		return getPersistence().update(godovoj_plan_zakupok, serviceContext);
	}

	/**
	* Caches the godovoj_plan_zakupok in the entity cache if it is enabled.
	*
	* @param godovoj_plan_zakupok the godovoj_plan_zakupok
	*/
	public static void cacheResult(godovoj_plan_zakupok godovoj_plan_zakupok) {
		getPersistence().cacheResult(godovoj_plan_zakupok);
	}

	/**
	* Caches the godovoj_plan_zakupoks in the entity cache if it is enabled.
	*
	* @param godovoj_plan_zakupoks the godovoj_plan_zakupoks
	*/
	public static void cacheResult(
		List<godovoj_plan_zakupok> godovoj_plan_zakupoks) {
		getPersistence().cacheResult(godovoj_plan_zakupoks);
	}

	/**
	* Creates a new godovoj_plan_zakupok with the primary key. Does not add the godovoj_plan_zakupok to the database.
	*
	* @param godovoj_plan_zakupok_id the primary key for the new godovoj_plan_zakupok
	* @return the new godovoj_plan_zakupok
	*/
	public static godovoj_plan_zakupok create(long godovoj_plan_zakupok_id) {
		return getPersistence().create(godovoj_plan_zakupok_id);
	}

	/**
	* Removes the godovoj_plan_zakupok with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param godovoj_plan_zakupok_id the primary key of the godovoj_plan_zakupok
	* @return the godovoj_plan_zakupok that was removed
	* @throws NoSuchgodovoj_plan_zakupokException if a godovoj_plan_zakupok with the primary key could not be found
	*/
	public static godovoj_plan_zakupok remove(long godovoj_plan_zakupok_id)
		throws tj.godovoj.plan.zakupok.exception.NoSuchgodovoj_plan_zakupokException {
		return getPersistence().remove(godovoj_plan_zakupok_id);
	}

	public static godovoj_plan_zakupok updateImpl(
		godovoj_plan_zakupok godovoj_plan_zakupok) {
		return getPersistence().updateImpl(godovoj_plan_zakupok);
	}

	/**
	* Returns the godovoj_plan_zakupok with the primary key or throws a {@link NoSuchgodovoj_plan_zakupokException} if it could not be found.
	*
	* @param godovoj_plan_zakupok_id the primary key of the godovoj_plan_zakupok
	* @return the godovoj_plan_zakupok
	* @throws NoSuchgodovoj_plan_zakupokException if a godovoj_plan_zakupok with the primary key could not be found
	*/
	public static godovoj_plan_zakupok findByPrimaryKey(
		long godovoj_plan_zakupok_id)
		throws tj.godovoj.plan.zakupok.exception.NoSuchgodovoj_plan_zakupokException {
		return getPersistence().findByPrimaryKey(godovoj_plan_zakupok_id);
	}

	/**
	* Returns the godovoj_plan_zakupok with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param godovoj_plan_zakupok_id the primary key of the godovoj_plan_zakupok
	* @return the godovoj_plan_zakupok, or <code>null</code> if a godovoj_plan_zakupok with the primary key could not be found
	*/
	public static godovoj_plan_zakupok fetchByPrimaryKey(
		long godovoj_plan_zakupok_id) {
		return getPersistence().fetchByPrimaryKey(godovoj_plan_zakupok_id);
	}

	public static java.util.Map<java.io.Serializable, godovoj_plan_zakupok> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the godovoj_plan_zakupoks.
	*
	* @return the godovoj_plan_zakupoks
	*/
	public static List<godovoj_plan_zakupok> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the godovoj_plan_zakupoks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link godovoj_plan_zakupokModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of godovoj_plan_zakupoks
	* @param end the upper bound of the range of godovoj_plan_zakupoks (not inclusive)
	* @return the range of godovoj_plan_zakupoks
	*/
	public static List<godovoj_plan_zakupok> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the godovoj_plan_zakupoks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link godovoj_plan_zakupokModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of godovoj_plan_zakupoks
	* @param end the upper bound of the range of godovoj_plan_zakupoks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of godovoj_plan_zakupoks
	*/
	public static List<godovoj_plan_zakupok> findAll(int start, int end,
		OrderByComparator<godovoj_plan_zakupok> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the godovoj_plan_zakupoks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link godovoj_plan_zakupokModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of godovoj_plan_zakupoks
	* @param end the upper bound of the range of godovoj_plan_zakupoks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of godovoj_plan_zakupoks
	*/
	public static List<godovoj_plan_zakupok> findAll(int start, int end,
		OrderByComparator<godovoj_plan_zakupok> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the godovoj_plan_zakupoks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of godovoj_plan_zakupoks.
	*
	* @return the number of godovoj_plan_zakupoks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static godovoj_plan_zakupokPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<godovoj_plan_zakupokPersistence, godovoj_plan_zakupokPersistence> _serviceTracker =
		ServiceTrackerFactory.open(godovoj_plan_zakupokPersistence.class);
}