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

package tj.oblasti.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link oblastiLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see oblastiLocalService
 * @generated
 */
@ProviderType
public class oblastiLocalServiceWrapper implements oblastiLocalService,
	ServiceWrapper<oblastiLocalService> {
	public oblastiLocalServiceWrapper(oblastiLocalService oblastiLocalService) {
		_oblastiLocalService = oblastiLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _oblastiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oblastiLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _oblastiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _oblastiLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _oblastiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of oblastis.
	*
	* @return the number of oblastis
	*/
	@Override
	public int getoblastisCount() {
		return _oblastiLocalService.getoblastisCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _oblastiLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _oblastiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oblasti.model.impl.oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _oblastiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oblasti.model.impl.oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _oblastiLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the oblastis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.oblasti.model.impl.oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oblastis
	* @param end the upper bound of the range of oblastis (not inclusive)
	* @return the range of oblastis
	*/
	@Override
	public java.util.List<tj.oblasti.model.oblasti> getoblastis(int start,
		int end) {
		return _oblastiLocalService.getoblastis(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _oblastiLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _oblastiLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the oblasti to the database. Also notifies the appropriate model listeners.
	*
	* @param oblasti the oblasti
	* @return the oblasti that was added
	*/
	@Override
	public tj.oblasti.model.oblasti addoblasti(tj.oblasti.model.oblasti oblasti) {
		return _oblastiLocalService.addoblasti(oblasti);
	}

	/**
	* Creates a new oblasti with the primary key. Does not add the oblasti to the database.
	*
	* @param oblasti_id the primary key for the new oblasti
	* @return the new oblasti
	*/
	@Override
	public tj.oblasti.model.oblasti createoblasti(long oblasti_id) {
		return _oblastiLocalService.createoblasti(oblasti_id);
	}

	/**
	* Deletes the oblasti with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oblasti_id the primary key of the oblasti
	* @return the oblasti that was removed
	* @throws PortalException if a oblasti with the primary key could not be found
	*/
	@Override
	public tj.oblasti.model.oblasti deleteoblasti(long oblasti_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _oblastiLocalService.deleteoblasti(oblasti_id);
	}

	/**
	* Deletes the oblasti from the database. Also notifies the appropriate model listeners.
	*
	* @param oblasti the oblasti
	* @return the oblasti that was removed
	*/
	@Override
	public tj.oblasti.model.oblasti deleteoblasti(
		tj.oblasti.model.oblasti oblasti) {
		return _oblastiLocalService.deleteoblasti(oblasti);
	}

	@Override
	public tj.oblasti.model.oblasti fetchoblasti(long oblasti_id) {
		return _oblastiLocalService.fetchoblasti(oblasti_id);
	}

	/**
	* Returns the oblasti with the primary key.
	*
	* @param oblasti_id the primary key of the oblasti
	* @return the oblasti
	* @throws PortalException if a oblasti with the primary key could not be found
	*/
	@Override
	public tj.oblasti.model.oblasti getoblasti(long oblasti_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _oblastiLocalService.getoblasti(oblasti_id);
	}

	/**
	* Updates the oblasti in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oblasti the oblasti
	* @return the oblasti that was updated
	*/
	@Override
	public tj.oblasti.model.oblasti updateoblasti(
		tj.oblasti.model.oblasti oblasti) {
		return _oblastiLocalService.updateoblasti(oblasti);
	}

	@Override
	public oblastiLocalService getWrappedService() {
		return _oblastiLocalService;
	}

	@Override
	public void setWrappedService(oblastiLocalService oblastiLocalService) {
		_oblastiLocalService = oblastiLocalService;
	}

	private oblastiLocalService _oblastiLocalService;
}