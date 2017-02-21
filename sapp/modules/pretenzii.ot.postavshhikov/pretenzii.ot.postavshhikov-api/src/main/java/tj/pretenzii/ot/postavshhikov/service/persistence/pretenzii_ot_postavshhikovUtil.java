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

package tj.pretenzii.ot.postavshhikov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.pretenzii.ot.postavshhikov.model.pretenzii_ot_postavshhikov;

import java.util.List;

/**
 * The persistence utility for the pretenzii_ot_postavshhikov service. This utility wraps {@link tj.pretenzii.ot.postavshhikov.service.persistence.impl.pretenzii_ot_postavshhikovPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see pretenzii_ot_postavshhikovPersistence
 * @see tj.pretenzii.ot.postavshhikov.service.persistence.impl.pretenzii_ot_postavshhikovPersistenceImpl
 * @generated
 */
@ProviderType
public class pretenzii_ot_postavshhikovUtil {
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
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		getPersistence().clearCache(pretenzii_ot_postavshhikov);
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
	public static List<pretenzii_ot_postavshhikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<pretenzii_ot_postavshhikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<pretenzii_ot_postavshhikov> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<pretenzii_ot_postavshhikov> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static pretenzii_ot_postavshhikov update(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		return getPersistence().update(pretenzii_ot_postavshhikov);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static pretenzii_ot_postavshhikov update(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(pretenzii_ot_postavshhikov, serviceContext);
	}

	/**
	* Caches the pretenzii_ot_postavshhikov in the entity cache if it is enabled.
	*
	* @param pretenzii_ot_postavshhikov the pretenzii_ot_postavshhikov
	*/
	public static void cacheResult(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		getPersistence().cacheResult(pretenzii_ot_postavshhikov);
	}

	/**
	* Caches the pretenzii_ot_postavshhikovs in the entity cache if it is enabled.
	*
	* @param pretenzii_ot_postavshhikovs the pretenzii_ot_postavshhikovs
	*/
	public static void cacheResult(
		List<pretenzii_ot_postavshhikov> pretenzii_ot_postavshhikovs) {
		getPersistence().cacheResult(pretenzii_ot_postavshhikovs);
	}

	/**
	* Creates a new pretenzii_ot_postavshhikov with the primary key. Does not add the pretenzii_ot_postavshhikov to the database.
	*
	* @param pretenzii_ot_postavshhikov_id the primary key for the new pretenzii_ot_postavshhikov
	* @return the new pretenzii_ot_postavshhikov
	*/
	public static pretenzii_ot_postavshhikov create(
		long pretenzii_ot_postavshhikov_id) {
		return getPersistence().create(pretenzii_ot_postavshhikov_id);
	}

	/**
	* Removes the pretenzii_ot_postavshhikov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pretenzii_ot_postavshhikov_id the primary key of the pretenzii_ot_postavshhikov
	* @return the pretenzii_ot_postavshhikov that was removed
	* @throws NoSuchpretenzii_ot_postavshhikovException if a pretenzii_ot_postavshhikov with the primary key could not be found
	*/
	public static pretenzii_ot_postavshhikov remove(
		long pretenzii_ot_postavshhikov_id)
		throws tj.pretenzii.ot.postavshhikov.exception.NoSuchpretenzii_ot_postavshhikovException {
		return getPersistence().remove(pretenzii_ot_postavshhikov_id);
	}

	public static pretenzii_ot_postavshhikov updateImpl(
		pretenzii_ot_postavshhikov pretenzii_ot_postavshhikov) {
		return getPersistence().updateImpl(pretenzii_ot_postavshhikov);
	}

	/**
	* Returns the pretenzii_ot_postavshhikov with the primary key or throws a {@link NoSuchpretenzii_ot_postavshhikovException} if it could not be found.
	*
	* @param pretenzii_ot_postavshhikov_id the primary key of the pretenzii_ot_postavshhikov
	* @return the pretenzii_ot_postavshhikov
	* @throws NoSuchpretenzii_ot_postavshhikovException if a pretenzii_ot_postavshhikov with the primary key could not be found
	*/
	public static pretenzii_ot_postavshhikov findByPrimaryKey(
		long pretenzii_ot_postavshhikov_id)
		throws tj.pretenzii.ot.postavshhikov.exception.NoSuchpretenzii_ot_postavshhikovException {
		return getPersistence().findByPrimaryKey(pretenzii_ot_postavshhikov_id);
	}

	/**
	* Returns the pretenzii_ot_postavshhikov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pretenzii_ot_postavshhikov_id the primary key of the pretenzii_ot_postavshhikov
	* @return the pretenzii_ot_postavshhikov, or <code>null</code> if a pretenzii_ot_postavshhikov with the primary key could not be found
	*/
	public static pretenzii_ot_postavshhikov fetchByPrimaryKey(
		long pretenzii_ot_postavshhikov_id) {
		return getPersistence().fetchByPrimaryKey(pretenzii_ot_postavshhikov_id);
	}

	public static java.util.Map<java.io.Serializable, pretenzii_ot_postavshhikov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the pretenzii_ot_postavshhikovs.
	*
	* @return the pretenzii_ot_postavshhikovs
	*/
	public static List<pretenzii_ot_postavshhikov> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the pretenzii_ot_postavshhikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pretenzii_ot_postavshhikovs
	* @param end the upper bound of the range of pretenzii_ot_postavshhikovs (not inclusive)
	* @return the range of pretenzii_ot_postavshhikovs
	*/
	public static List<pretenzii_ot_postavshhikov> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the pretenzii_ot_postavshhikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pretenzii_ot_postavshhikovs
	* @param end the upper bound of the range of pretenzii_ot_postavshhikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pretenzii_ot_postavshhikovs
	*/
	public static List<pretenzii_ot_postavshhikov> findAll(int start, int end,
		OrderByComparator<pretenzii_ot_postavshhikov> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the pretenzii_ot_postavshhikovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pretenzii_ot_postavshhikovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pretenzii_ot_postavshhikovs
	* @param end the upper bound of the range of pretenzii_ot_postavshhikovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of pretenzii_ot_postavshhikovs
	*/
	public static List<pretenzii_ot_postavshhikov> findAll(int start, int end,
		OrderByComparator<pretenzii_ot_postavshhikov> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the pretenzii_ot_postavshhikovs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of pretenzii_ot_postavshhikovs.
	*
	* @return the number of pretenzii_ot_postavshhikovs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static pretenzii_ot_postavshhikovPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<pretenzii_ot_postavshhikovPersistence, pretenzii_ot_postavshhikovPersistence> _serviceTracker =
		ServiceTrackerFactory.open(pretenzii_ot_postavshhikovPersistence.class);
}