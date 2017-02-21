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

package tj.reestr.kontraktov.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link reestr_kontraktovLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see reestr_kontraktovLocalService
 * @generated
 */
@ProviderType
public class reestr_kontraktovLocalServiceWrapper
	implements reestr_kontraktovLocalService,
		ServiceWrapper<reestr_kontraktovLocalService> {
	public reestr_kontraktovLocalServiceWrapper(
		reestr_kontraktovLocalService reestr_kontraktovLocalService) {
		_reestr_kontraktovLocalService = reestr_kontraktovLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _reestr_kontraktovLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _reestr_kontraktovLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _reestr_kontraktovLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of reestr_kontraktovs.
	*
	* @return the number of reestr_kontraktovs
	*/
	@Override
	public int getreestr_kontraktovsCount() {
		return _reestr_kontraktovLocalService.getreestr_kontraktovsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _reestr_kontraktovLocalService.getOSGiServiceIdentifier();
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
		return _reestr_kontraktovLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.reestr.kontraktov.model.impl.reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _reestr_kontraktovLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.reestr.kontraktov.model.impl.reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _reestr_kontraktovLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the reestr_kontraktovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tj.reestr.kontraktov.model.impl.reestr_kontraktovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reestr_kontraktovs
	* @param end the upper bound of the range of reestr_kontraktovs (not inclusive)
	* @return the range of reestr_kontraktovs
	*/
	@Override
	public java.util.List<tj.reestr.kontraktov.model.reestr_kontraktov> getreestr_kontraktovs(
		int start, int end) {
		return _reestr_kontraktovLocalService.getreestr_kontraktovs(start, end);
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
		return _reestr_kontraktovLocalService.dynamicQueryCount(dynamicQuery);
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
		return _reestr_kontraktovLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the reestr_kontraktov to the database. Also notifies the appropriate model listeners.
	*
	* @param reestr_kontraktov the reestr_kontraktov
	* @return the reestr_kontraktov that was added
	*/
	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov addreestr_kontraktov(
		tj.reestr.kontraktov.model.reestr_kontraktov reestr_kontraktov) {
		return _reestr_kontraktovLocalService.addreestr_kontraktov(reestr_kontraktov);
	}

	/**
	* Creates a new reestr_kontraktov with the primary key. Does not add the reestr_kontraktov to the database.
	*
	* @param reestr_kontraktov_id the primary key for the new reestr_kontraktov
	* @return the new reestr_kontraktov
	*/
	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov createreestr_kontraktov(
		java.lang.String reestr_kontraktov_id) {
		return _reestr_kontraktovLocalService.createreestr_kontraktov(reestr_kontraktov_id);
	}

	/**
	* Deletes the reestr_kontraktov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	* @return the reestr_kontraktov that was removed
	* @throws PortalException if a reestr_kontraktov with the primary key could not be found
	*/
	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov deletereestr_kontraktov(
		java.lang.String reestr_kontraktov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _reestr_kontraktovLocalService.deletereestr_kontraktov(reestr_kontraktov_id);
	}

	/**
	* Deletes the reestr_kontraktov from the database. Also notifies the appropriate model listeners.
	*
	* @param reestr_kontraktov the reestr_kontraktov
	* @return the reestr_kontraktov that was removed
	*/
	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov deletereestr_kontraktov(
		tj.reestr.kontraktov.model.reestr_kontraktov reestr_kontraktov) {
		return _reestr_kontraktovLocalService.deletereestr_kontraktov(reestr_kontraktov);
	}

	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov fetchreestr_kontraktov(
		java.lang.String reestr_kontraktov_id) {
		return _reestr_kontraktovLocalService.fetchreestr_kontraktov(reestr_kontraktov_id);
	}

	/**
	* Returns the reestr_kontraktov with the primary key.
	*
	* @param reestr_kontraktov_id the primary key of the reestr_kontraktov
	* @return the reestr_kontraktov
	* @throws PortalException if a reestr_kontraktov with the primary key could not be found
	*/
	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov getreestr_kontraktov(
		java.lang.String reestr_kontraktov_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _reestr_kontraktovLocalService.getreestr_kontraktov(reestr_kontraktov_id);
	}

	/**
	* Updates the reestr_kontraktov in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param reestr_kontraktov the reestr_kontraktov
	* @return the reestr_kontraktov that was updated
	*/
	@Override
	public tj.reestr.kontraktov.model.reestr_kontraktov updatereestr_kontraktov(
		tj.reestr.kontraktov.model.reestr_kontraktov reestr_kontraktov) {
		return _reestr_kontraktovLocalService.updatereestr_kontraktov(reestr_kontraktov);
	}

	@Override
	public reestr_kontraktovLocalService getWrappedService() {
		return _reestr_kontraktovLocalService;
	}

	@Override
	public void setWrappedService(
		reestr_kontraktovLocalService reestr_kontraktovLocalService) {
		_reestr_kontraktovLocalService = reestr_kontraktovLocalService;
	}

	private reestr_kontraktovLocalService _reestr_kontraktovLocalService;
}