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

package tj.rajony.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link rajonyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see rajonyLocalService
 * @generated
 */
@ProviderType
public class rajonyLocalServiceWrapper implements rajonyLocalService,
	ServiceWrapper<rajonyLocalService> {
	public rajonyLocalServiceWrapper(rajonyLocalService rajonyLocalService) {
		_rajonyLocalService = rajonyLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _rajonyLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rajonyLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _rajonyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rajonyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rajonyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of rajonies.
	*
	* @return the number of rajonies
	*/
	@Override
	public int getrajoniesCount() {
		return _rajonyLocalService.getrajoniesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _rajonyLocalService.getOSGiServiceIdentifier();
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
		return _rajonyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rajony.model.impl.rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rajonyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rajony.model.impl.rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rajonyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.rajony.model.impl.rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rajonies
	* @param end the upper bound of the range of rajonies (not inclusive)
	* @return the range of rajonies
	*/
	@Override
	public java.util.List<tj.rajony.model.rajony> getrajonies(int start, int end) {
		return _rajonyLocalService.getrajonies(start, end);
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
		return _rajonyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _rajonyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the rajony to the database. Also notifies the appropriate model listeners.
	*
	* @param rajony the rajony
	* @return the rajony that was added
	*/
	@Override
	public tj.rajony.model.rajony addrajony(tj.rajony.model.rajony rajony) {
		return _rajonyLocalService.addrajony(rajony);
	}

	/**
	* Creates a new rajony with the primary key. Does not add the rajony to the database.
	*
	* @param rajony_id the primary key for the new rajony
	* @return the new rajony
	*/
	@Override
	public tj.rajony.model.rajony createrajony(long rajony_id) {
		return _rajonyLocalService.createrajony(rajony_id);
	}

	/**
	* Deletes the rajony with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rajony_id the primary key of the rajony
	* @return the rajony that was removed
	* @throws PortalException if a rajony with the primary key could not be found
	*/
	@Override
	public tj.rajony.model.rajony deleterajony(long rajony_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rajonyLocalService.deleterajony(rajony_id);
	}

	/**
	* Deletes the rajony from the database. Also notifies the appropriate model listeners.
	*
	* @param rajony the rajony
	* @return the rajony that was removed
	*/
	@Override
	public tj.rajony.model.rajony deleterajony(tj.rajony.model.rajony rajony) {
		return _rajonyLocalService.deleterajony(rajony);
	}

	@Override
	public tj.rajony.model.rajony fetchrajony(long rajony_id) {
		return _rajonyLocalService.fetchrajony(rajony_id);
	}

	/**
	* Returns the rajony with the primary key.
	*
	* @param rajony_id the primary key of the rajony
	* @return the rajony
	* @throws PortalException if a rajony with the primary key could not be found
	*/
	@Override
	public tj.rajony.model.rajony getrajony(long rajony_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rajonyLocalService.getrajony(rajony_id);
	}

	/**
	* Updates the rajony in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rajony the rajony
	* @return the rajony that was updated
	*/
	@Override
	public tj.rajony.model.rajony updaterajony(tj.rajony.model.rajony rajony) {
		return _rajonyLocalService.updaterajony(rajony);
	}

	@Override
	public rajonyLocalService getWrappedService() {
		return _rajonyLocalService;
	}

	@Override
	public void setWrappedService(rajonyLocalService rajonyLocalService) {
		_rajonyLocalService = rajonyLocalService;
	}

	private rajonyLocalService _rajonyLocalService;
}